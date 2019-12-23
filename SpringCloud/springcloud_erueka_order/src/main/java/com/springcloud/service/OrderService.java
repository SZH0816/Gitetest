package com.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("member-server")
public interface OrderService {

    @RequestMapping("/member")
    public String getOrder();
}
