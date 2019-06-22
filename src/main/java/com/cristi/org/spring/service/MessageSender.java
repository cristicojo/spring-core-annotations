package com.cristi.org.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    private MessageBuilder builder;

    public void sendMessage(){

        System.out.println("Sendin Message: ");
        String message=builder.createMessage();

        System.out.println(message +"sent!!!!");
    }


}

