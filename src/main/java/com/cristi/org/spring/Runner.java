package com.cristi.org.spring;

import com.cristi.org.spring.config.AppConfig;
import com.cristi.org.spring.service.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {

        //cu fisier xml
        //ApplicationContext context=new ClassPathXmlApplicationContext("classpath:app-context.xml");
        //MessageSender messageSender=context.getBean(MessageSender.class);
        //messageSender.sendMessage();


        //cu annotations
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender=context.getBean(MessageSender.class);
        messageSender.sendMessage();

    }
}
