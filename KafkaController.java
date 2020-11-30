package com.kafka.test.Kafka_ms_poc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.test.Kafka_ms_poc.configuration.MyTopicConsumer;

import java.util.Map;

@RestController
public class KafkaController {

    private KafkaTemplate<String, String> template;
    private MyTopicConsumer myTopicConsumer;

    public KafkaController(KafkaTemplate<String, String> template, MyTopicConsumer myTopicConsumer) {
        this.template = template;
        this.myTopicConsumer = myTopicConsumer;
    }
    

    @PostMapping("/kafka/produce")
    public void produce(@RequestBody String message) {
        template.send("kafka-ms-poc", message);
    }

    @GetMapping("/kafka/messages")
    public Map<String,String> getMessages() {
        return myTopicConsumer.getMessages();
    }
    
    @GetMapping("/kafka/test")
    public String getTest() {
        return "Authenticated";
    }

}
