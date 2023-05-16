package com.marri.kafkaexemple;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.net.http.WebSocket;

@Component
public class KafkaLiteners {

    @KafkaListener(
            topics = "marri",
            groupId = "groupId"
    )
    public void Listener(MessageRequest data){
        System.out.println("Listeners received :" + data + " -> Good");
    }
}
