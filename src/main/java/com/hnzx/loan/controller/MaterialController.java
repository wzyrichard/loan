package com.hnzx.loan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: MaterialController
 * FileName：MaterialController.java
 * Description：资料控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/24			    create
 */
@Controller
@RequestMapping(value = "/material")
public class MaterialController {

    private String PREFIX = "/material";

    @GetMapping(value = {"/index", "/", ""})
    public String index() {
        return PREFIX + "/index";
    }
}
