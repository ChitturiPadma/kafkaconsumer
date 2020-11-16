package com.spring.kafka.demos.kafkaconsumer.consumer;

import org.apache.kafka.common.protocol.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloKafkaConsumer {

    @KafkaListener(topics = "thello")
    public void consume(String message)
    {
        System.out.println(message);
    }
}
