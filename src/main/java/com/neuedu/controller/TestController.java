package com.neuedu.controller;

import com.neuedu.pojo.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user1")
public class TestController {
    @RequestMapping(value="/login.do")
    public UserInfo userInfo(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId(1);
        userInfo.setUsername("asdas");
        return userInfo;

    }
}
