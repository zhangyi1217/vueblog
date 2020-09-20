package com.zhangyi.controller;


import com.zhangyi.common.lang.Result;
import com.zhangyi.entity.User;
import com.zhangyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangyi
 * @since 2020-06-10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1);
        return Result.succ(200,"操作成功",user);
    }

}
