package com.hnzx.loan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: FinanceSituationController
 * FileName：FinanceSituationController.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/27			    create
 */
@Controller
@RequestMapping(value = "/finance")
public class FinanceSituationController {

    private static final String PREFIX = "/finance";

    @GetMapping(value = {"/index", "/", ""})
    public String index() {
        return PREFIX + "/index";
    }
}
