package com.hnzx.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: Loan
 * FileName：Loan.java
 * Description：贷款实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/25			    create
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Loan implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 3407989245215673418L;

    /**
     * 贷款主键
     */
    private Long loanId;

    /**
     * 贷款用户id
     */
    private Long loanUid;

    /**
     * 贷款金额
     */
    private String loanAmount;

    /**
     * 贷款期限
     */
    private String loanTerm;

    /**
     * 担保方式
     */
    private String guaranteeMethod;

    /**
     * 担保人名称
     */
    private String guarantorName;

    /**
     * 贷款方式
     */
    private String loanMethod;

    /**
     * 还款方式
     */
    private String repayment;

    /**
     * 贷款用途
     */
    private String loanUse;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
