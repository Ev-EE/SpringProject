package com.example.springproject;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "myTopic",
                    groupId = "groupId"
    )
    public void receiveMessage(String message) {
        System.out.println("Message Recieved: "+ message);
        //persist message to database
    }
}
