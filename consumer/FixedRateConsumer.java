package com.spring.kafka.demos.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class FixedRateConsumer {

    @KafkaListener(topics = "tfixedrate_2")
    public void consume(String message)
    {
        System.out.println("Consuming: " +  message);

    }
}
