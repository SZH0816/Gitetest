package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Value("${userName}")
    String userName;

        @RequestMapping("/getConfig")
    public String getConfig(){
        return userName;
    }
}
