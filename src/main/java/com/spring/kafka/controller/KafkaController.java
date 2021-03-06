package com.spring.kafka.controller;

import com.spring.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private Producer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic (@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }
}
