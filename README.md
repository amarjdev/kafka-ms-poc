# kafka-ms-poc

Kafka POC:
1. Send and Receive Kafka messages
2. Read Json from Kafka topic and Validate the Json message using Everit
3. For Authenticaton Used OAuth2 with Git 


Rest End point :
To Read Messages for :http:localhost:9000/kafka/messages
To Push messages to Kafka topic :http:loclahost:9000/kafka/produce 

Docker Commands to start and create topic in Kafka
docker-compose up -d
docker-compose exec broker kafka-topics --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic kafka-ms-poc


