package com.ultrapower.demo.eurekaclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {

        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    private String port;
//
//    @Bean
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//    @Autowired
//    private RestTemplate restTemplate;
    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "jinan") String name) {
        return "hi,i am eureka client,port:" + port + ",name is " + name;
    }

//    @RequestMapping("/test")
//    public String handle(){
//        logger.info("call trace service-hello");
//        return restTemplate.getForObject("http://localhost:8763/hello", String.class);
//    }
}
