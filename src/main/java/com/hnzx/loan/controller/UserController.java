package com.hnzx.loan.controller;

import com.hnzx.loan.model.User;
import com.hnzx.loan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: UserController
 * FileName：UserController.java
 * Description：用户控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 依赖注入用户服务
     */
    @Autowired
    private IUserService userService;

    /**
     * 添加用户
     * @param user
     */
    @PostMapping(value = "/save")
    @ResponseBody
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
