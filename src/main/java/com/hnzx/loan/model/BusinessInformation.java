package com.hnzx.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * ClassName: BusinessInformation
 * FileName：BusinessInformation.java
 * Description：经营信息实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/24			    create
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BusinessInformation implements Serializable {

    private static final long serialVersionUID = -3009239221466341165L;

    private Long bizInfoId;
}
