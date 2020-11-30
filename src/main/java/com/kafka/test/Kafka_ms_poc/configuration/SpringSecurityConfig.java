package com.kafka.test.Kafka_ms_poc.configuration;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SpringSecurityConfig {
  @Bean
  public ServletWebServerFactory servletWebServerFactory() {
      return new TomcatServletWebServerFactory();
  }
}
