package com.springcloud.demo.cloudproducerstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication
public class CloudProducerStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProducerStreamApplication.class, args);
    }

}
