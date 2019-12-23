package com.springcloud.controller;

import com.springcloud.service.MemberService;
import com.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderConroller {

    @Resource
    private MemberService memberService;


    @RequestMapping("/getOrderByMember")
    public String getOrderByMember(){
        return memberService.getMember();
    }

    @RequestMapping("/orderinfo")
    public String getOne(){
        return "orderinfo";
    }
}
