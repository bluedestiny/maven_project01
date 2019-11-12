package com.springcloud.demo.cloudconsumerstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

//@EnableBinding(Sink.class)
//public class RecieveService {
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    @StreamListener(Sink.INPUT)
//    public void recieve(Object payload){
//        logger.info("接收消息：" + payload);
//        System.out.println(payload);
//    }
//
//}