package br.com.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(String user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
