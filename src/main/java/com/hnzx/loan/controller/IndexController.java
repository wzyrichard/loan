package com.hnzx.loan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: IndexController
 * FileName：IndexController.java
 * Description：首页控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "welcome";
    }
}
