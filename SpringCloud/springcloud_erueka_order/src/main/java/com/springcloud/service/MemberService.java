package com.springcloud.service;


import com.springcloud.MemberServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * fallback服务降级执行得本地类
 */
@FeignClient(value = "member-server",fallback = MemberServiceFallBack.class)
public interface MemberService {
    /**
     * 获取会员信息
     * @return
     */
    @RequestMapping("/getMember")
    public String getMember();
}
