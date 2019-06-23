package com.hnzx.loan.enums;

import lombok.Data;

/**
 * ClassName: GenderEnum
 * FileName：GenderEnum.java
 * Description：性别枚举类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
public enum GenderEnum implements BaseEnum {

    MALE("男"),
    FAMALE("女");

    private String value;

    GenderEnum(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
