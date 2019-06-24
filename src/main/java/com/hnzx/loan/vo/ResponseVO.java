package com.hnzx.loan.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ClassName: ResponseVO
 * FileName：ResponseVO.java
 * Description：响应前端视图类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
@Data
@AllArgsConstructor
public final class ResponseVO<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

}
