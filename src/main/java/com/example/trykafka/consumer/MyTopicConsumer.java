package com.example.trykafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyTopicConsumer {

    private final List<String> messages = new ArrayList<>();


    @KafkaListener(topics = "firstTryTopic", groupId = "firstTryGroup")
    public void kafkaListener(String message){
        System.out.println(message);
    }


    public List<String> getMessages() {
        return messages;
    }




}
