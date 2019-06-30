package com.hnzx.loan.service.impl;

import com.hnzx.loan.enums.BusinessEnum;
import com.hnzx.loan.exception.BusinessException;
import com.hnzx.loan.mapper.LoanMapper;
import com.hnzx.loan.model.Loan;
import com.hnzx.loan.service.ILoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ClassName: LoanServiceImpl
 * FileName：LoanServiceImpl.java
 * Description：贷款服务实现类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/25			    create
 */
@Service
public class LoanServiceImpl implements ILoanService {

    /**
     * 依赖注入贷款Dao
     */
    @Autowired
    private LoanMapper loanMapper;

    /**
     * 添加贷款
     * @param loan
     * @return
     */
    @Transactional
    @Override
    public int saveLoan(Loan loan) {
        if (StringUtils.isEmpty(loan)) {
            throw new BusinessException(BusinessEnum.REQUEST_NULL);
        }
        return loanMapper.saveLoan(loan);
    }

    @Override
    public Loan findLoanById(Long loanId) {
        return null;
    }

    @Override
    public List<Loan> findAllLoan() {
        return null;
    }

    @Override
    public int updateLoan(Loan loan) {
        return 0;
    }

    @Override
    public int deleteLoan(Long loanId) {
        return 0;
    }
}
