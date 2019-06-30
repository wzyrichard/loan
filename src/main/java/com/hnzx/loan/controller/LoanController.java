package com.hnzx.loan.controller;

import com.hnzx.loan.model.Loan;
import com.hnzx.loan.model.User;
import com.hnzx.loan.service.ILoanService;
import com.hnzx.loan.tool.ResponseTool;
import com.hnzx.loan.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    
    @Autowired
    private ILoanService loanService;

    @GetMapping(value = {"/index", "/", ""})
    public String index() {
        return PREFIX + "/index";
    }

    @PostMapping(value = "/save")
    @ResponseBody
    public ResponseVO saveLoan(@Valid @RequestBody Loan loan, BindingResult bindingResult) {
        System.out.println("提交过来的贷款数据:" + loan);
        /*if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach((error) -> {
                    FieldError fieldError = (FieldError) error;
                    //属性
                    String field = fieldError.getField();
                    //错误信息
                    String message = fieldError.getDefaultMessage();
                    System.out.println(field + ":" + message);
            });
        }*/
        int result = loanService.saveLoan(loan);
        return new ResponseTool().success();
    }

    /**
     * 贷款申明
     * @return
     */
    @GetMapping(value = "/declaration")
    public String declaration() {
        return PREFIX + "/declaration";
    }
}
