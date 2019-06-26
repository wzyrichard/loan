package com.hnzx.loan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: LoanController
 * FileName：LoanController.java
 * Description：贷款控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/26			    create
 */
@Controller
@RequestMapping(value = "/loan")
public class LoanController {

    private static final String PREFIX = "/loan";

    @GetMapping(value = {"/index", "/", ""})
    public String index() {
        return PREFIX + "/index";
    }
}
