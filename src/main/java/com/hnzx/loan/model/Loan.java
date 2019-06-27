package com.hnzx.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

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

    private static final long serialVersionUID = 3407989245215673418L;

    private Long loanId;

    private String name;

    private BigDecimal loanAmount;

    private String loanTerm;

    private Integer guaranteeMethod;

    private String guarantorName;

    private String loanMethod;

    private String repayment;
}
