package com.spring.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Producer {

    private static final String TOPIC="users";

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage (String message) {
        log.info("Producing message : ---> " + message);
        kafkaTemplate.send(TOPIC, message);
    }
}
