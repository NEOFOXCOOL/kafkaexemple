package com.marri.kafkaexemple;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/api/message")
public class MessageController {
    private KafkaTemplate<String,String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PutMapping
    public void publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("marri",request.message());
    }
}
