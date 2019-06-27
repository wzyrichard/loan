package com.hnzx.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: BusinessInfo
 * FileName：BusinessInfo.java
 * Description：经营信息实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/24			    create
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BusinessInfo implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -3009239221466341165L;

    /**
     * 经营信息主键
     */
    private Long bizInfoId;

    /**
     * 用户主键
     */
    private Long uid;

    /**
     * 经营项目名称
     */
    private String businessProjectName;

    /**
     * 经营规模
     */
    private Integer businessScale;

    /**
     * 已经营年限
     */
    private Integer yearsOfOperation;

    /**
     * 场所面积
     */
    private Double siteArea;

    /**
     * 前一年自筹资金
     */
    private BigDecimal previousYearSelfFunding;

    /**
     * 前一年贷款资金
     */
    private BigDecimal previousYearLoanAmount;

    /**
     * 前一年销售收入
     */
    private BigDecimal previousYearSalesRevenue;

    /**
     * 前一年净收入
     */
    private BigDecimal previousYearNetIncome;

    /**
     * 来年自筹资金
     */
    private BigDecimal comingYearSelfFinancing;

    /**
     * 来年贷款资金
     */
    private BigDecimal comingYearLoanAmount;

    /**
     * 来年预期销售收入
     */
    private BigDecimal comingYearExpectedSalesRevenue;

    /**
     * 来年预期净收入
     */
    private BigDecimal comingYearNetIncome;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
