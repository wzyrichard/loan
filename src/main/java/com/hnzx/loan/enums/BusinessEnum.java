package com.hnzx.loan.enums;

import lombok.Data;

/**
 * ClassName: BusinessEnum
 * FileName：BusinessEnum.java
 * Description：业务枚举类型
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
public enum BusinessEnum {

    REQUEST_NULL(1000, "请求参数为空"),

    FAIL(4000, "操作失败"),

    SUCCESS(2000, "操作成功"),

    INVALID(4001, "操作无效");

    private Integer code;

    private String message;

    BusinessEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
