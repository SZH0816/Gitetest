package com.springcloud.controller;

import com.springcloud.service.IDoSomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IDoSomeController {
   /* @Resource
    private RestTemplate restTemplate;*/

    @Resource
    private IDoSomeService iDoSomeService;


    @RequestMapping("/doSome")

    public String doSme(){
        System.out.println("ConsumerController");
        /*return restTemplate.getForObject("http://euraka-provider/doSome",String.class);*/
       return iDoSomeService.doSome();
    }
}
