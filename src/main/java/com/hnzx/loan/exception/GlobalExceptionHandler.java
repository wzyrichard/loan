package com.hnzx.loan.exception;

import com.hnzx.loan.enums.BusinessEnum;
import com.hnzx.loan.tool.ResponseTool;
import com.hnzx.loan.vo.ResponseVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: GlobalExceptionHandler
 * FileName：GlobalExceptionHandler.java
 * Description：全局异常处理
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseVO defaultExceptionHandler(HttpServletRequest request, Exception e) {
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException)e;
            return new ResponseTool().error(BusinessEnum.FAIL.getCode(), BusinessEnum.FAIL.getMessage());
        }
        return new ResponseTool().error(BusinessEnum.REQUEST_NULL.getCode(),BusinessEnum.REQUEST_NULL.getMessage());
    }
}
