package com.hnzx.loan.service;

import com.hnzx.loan.model.User;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: IUserService
 * FileName：IUserService.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
public interface IUserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 查找用户
     * @param userId
     * @return
     */
    User findUserById(@Param("userId")Long userId);

    /**
     * 查找所有用户
     * @return
     */
    List<User> findAllUser();

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int deleteUser(@Param("userId")Long userId);
}