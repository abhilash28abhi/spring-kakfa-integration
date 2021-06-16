package com.spring.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @KafkaListener(groupId = "group_id", topics = TOPIC)
    public void consume (String message) {
        log.info("Consumed message : ---> " + message);
    }
}
