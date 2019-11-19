package com.miracle.feign.Client;/**
 * @Auther: lirongjie
 * @Date: 2019/4/8 10:44
 * @Description:
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "admin-client")
@Component
public interface SchedualServiceHi {
    @RequestMapping(value = "/user/testUser",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "userName") String name);
}




