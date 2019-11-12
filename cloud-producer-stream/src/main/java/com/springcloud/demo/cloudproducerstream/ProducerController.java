package com.springcloud.demo.cloudproducerstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SendService sendService;
    @RequestMapping("/send/{msg}")
    public void send(@PathVariable("msg") String msg){
        logger.info("发送消息");
        sendService.sendMsg(msg);
    }
}