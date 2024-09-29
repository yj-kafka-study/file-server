package com.example.fileserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "topic", groupId = "group_1")
    public void listen(String message) {
        log.info("HIHIHI");
        System.out.println(message);
    }
}
