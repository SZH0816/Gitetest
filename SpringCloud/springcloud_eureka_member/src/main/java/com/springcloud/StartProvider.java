package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class StartProvider {
    public static void main(String[] args) {
        SpringApplication.run(StartProvider.class,args);
    }


}
 /*@Bean
    @LoadBalanced
        //实现负载均衡
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }*/