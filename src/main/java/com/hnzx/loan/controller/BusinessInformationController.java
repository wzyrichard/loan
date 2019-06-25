package com.hnzx.loan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: BusinessInformationController
 * FileName：BusinessInformationController.java
 * Description：经营信息控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/24			    create
 */
@Controller
@RequestMapping(value = "/business")
public class BusinessInformationController {

    /**
     * 声明前缀
     */
    private String PREFIX = "/business";

    /**
     * 经营信息首页
     * @return
     */
    @GetMapping(value = {"/index", "/", ""})
    public String index() {
        return PREFIX + "/index";
    }
}
