package com.springcloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class StartProvider {
    public static void main(String[] args) {
        SpringApplication.run(StartProvider.class,args);
    }

   /* @Bean
    @LoadBalanced  //实现负载均衡
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }*/

   //指定负载均衡策略
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
