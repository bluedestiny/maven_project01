package com.springcloud.demo.cloudproducerstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(MySource.class)
public class SendService {
    @Autowired
    private MySource source;


    public void sendMsg(String msg){

        source.myOutput().send(MessageBuilder.withPayload(msg).build());
    }

}