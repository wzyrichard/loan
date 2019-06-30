package com.hnzx.loan.service;

import com.hnzx.loan.model.Loan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: ILoanService
 * FileName：ILoanService.java
 * Description：贷款服务接口
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/29			    create
 */
public interface ILoanService {

    /**
     * 保存贷款
     * @param loan
     * @return
     */
    int saveLoan(@Param("loan") Loan loan);

    /**
     * 查找贷款
     * @param loanId
     * @return
     */
    Loan findLoanById(@Param("loanId")Long loanId);

    /**
     * 所有贷款
     * @return
     */
    List<Loan> findAllLoan();

    /**
     * 更新贷款
     * @param loan
     * @return
     */
    int updateLoan(@Param("loan")Loan loan);

    /**
     * 删除贷款
     * @param loanId
     * @return
     */
    int deleteLoan(@Param("loanId")Long loanId);
}
