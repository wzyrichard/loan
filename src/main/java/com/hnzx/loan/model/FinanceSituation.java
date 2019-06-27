package com.hnzx.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * ClassName: FinanceSituationController
 * FileName：FinanceSituationController.java
 * Description：财务状况实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/27			    create
 */
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class FinanceSituation implements Serializable {

    private static final long serialVersionUID = -2919929972087061061L;

    private Long fsId;

    private String name;
}
