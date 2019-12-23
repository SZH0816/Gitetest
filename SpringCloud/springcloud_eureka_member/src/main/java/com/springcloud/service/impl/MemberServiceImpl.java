package com.springcloud.service.impl;

import com.springcloud.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberServiceImpl implements MemberService {

    @RequestMapping("/getMember")
    @Override
    public String getMember() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("member getMember方法");
        return "member";
    }
}
