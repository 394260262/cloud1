package com.miracle.adminclient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lirongjie
 * @Date: 2019/4/4 14:26
 * @Description:
 */

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value="/testUser")
    public String testUser (String userName){
        String result = "我是来自"+serverPort+"的"+userName;
        return result;
    }
}
