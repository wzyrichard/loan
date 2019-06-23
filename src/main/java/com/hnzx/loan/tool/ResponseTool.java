package com.hnzx.loan.tool;

import com.hnzx.loan.enums.BusinessEnum;
import com.hnzx.loan.vo.ResponseVO;

/**
 * ClassName: ResponseTool
 * FileName：ResponseTool.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
public final class ResponseTool {

    public final ResponseVO success(Integer code, String message, Object data) {
        return new ResponseVO(code, message, data);
    }

    public final ResponseVO success(Object data) {
        int code = BusinessEnum.SUCCESS.getCode();

        String message = BusinessEnum.SUCCESS.getMessage();

        return new ResponseVO(code, message, data);
    }

    public final ResponseVO success() {
        return this.success(null);
    }

    public final ResponseVO error(BusinessEnum businessEnum) {
        return new ResponseVO(businessEnum.FAIL.getCode(), businessEnum.FAIL.getMessage(), null);
    }

    public final ResponseVO error(Integer code, String message) {
        return new ResponseVO(code, message, null);
    }
}
