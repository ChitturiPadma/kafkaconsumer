package com.spring.kafka.demos.kafkaconsumer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaKeyConsumer {

    @KafkaListener(topics = "tmulti_partitions", concurrency = "4")
    public void consume(ConsumerRecord<String, String> message ) throws InterruptedException {
        System.out.println("Key: " + message.key() + ":Message:" + message.value());
        Thread.sleep(1000);
    }
}
