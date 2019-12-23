package com.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("euraka-provider")
public interface IDoSomeService {
    @RequestMapping("/doSome")
    public  String doSome();
}
