package com.hnzx.loan.exception;

import com.hnzx.loan.enums.BusinessEnum;
import lombok.Data;

/**
 * ClassName: BusinessException
 * FileName：BusinessException.java
 * Description：业务异常
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1229064588833378450L;
    /**
     * 业务状态码
     */
    private Integer code;

    public BusinessException() {}

    public BusinessException(BusinessEnum businessEnum) {
        super(businessEnum.getMessage());
        this.code = businessEnum.getCode() ;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
