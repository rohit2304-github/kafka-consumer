package com.assignment.spring.kafka.api;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(groupId = "driver", topics = "${driver.topic.name}", containerFactory = "driverKafkaListenerContainerFactory")
    public void getMessageFromTopic(Driver driver) {

        System.out.println("Driver object received " + driver.toString());
    }

}
