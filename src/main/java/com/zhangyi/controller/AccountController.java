package com.zhangyi.controller;

import com.zhangyi.common.lang.Result;
import com.zhangyi.service.UserService;
import com.zhangyi.shiro.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping("/login")
    public Result login(){
        //TODO
        return null;
    }


}
