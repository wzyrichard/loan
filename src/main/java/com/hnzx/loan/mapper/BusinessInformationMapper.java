package com.hnzx.loan.mapper;

import com.hnzx.loan.model.BusinessInformation;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: BusinessInformationMapper
 * FileName：BusinessInformationMapper.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/24			    create
 */
@Mapper
public interface BusinessInformationMapper {

    int saveBusinessInformation(BusinessInformation businessInformation);
}
