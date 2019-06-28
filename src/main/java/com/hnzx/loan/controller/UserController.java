package com.hnzx.loan.controller;

import com.hnzx.loan.model.User;
import com.hnzx.loan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
     * 页面前缀
     */
    private String PREFIX = "/user";

    /**
     * 用户首页
     * @return
     */
    @GetMapping(value = {"/", ""})
    public String index() {
        return PREFIX + "/index";
    }

    /**
     * 用户登录接口
     * @return
     */
    @PostMapping(value = "/login")
    public String login() {
        return PREFIX + "/login";
    }

    /**
     * 添加用户
     * @param user
     */
    @PostMapping(value = "/save")
    @ResponseBody
    public void saveUser(@RequestBody User user) {
        System.out.println("提交过来的用户" + user);
        userService.saveUser(user);
    }

    /**
     * 用户退出
     */
    @PostMapping(value = "/logout")
    public void logout() {

    }
}
