package com.kafka.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.stereotype.Service;

import com.starter.kafka.dto.User;

@Service
public class UserConsumerService {


    @KafkaListener(topics={"user-topic"})
    public void consumeData(User user){
        System.out.println("user age is" + user.getAge() + "genre:"+ user.getGenre());
    }

    
}
