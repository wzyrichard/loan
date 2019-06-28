package com.hnzx.loan.controller;

import javafx.beans.binding.ObjectExpression;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: FileController
 * FileName：FileController.java
 * Description：文件上传控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/28			    create
 */
@Controller
@RequestMapping(value = "/file")
public class FileController {

    @PostMapping(value = "/upload")
    @ResponseBody
    public Object upload(@PathVariable String type) {
        System.out.println("调用文件上传接口" + type);
        return null;
    }
}
