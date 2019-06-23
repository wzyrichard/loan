package com.hnzx.loan.mapper;

import com.hnzx.loan.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: UserMapper
 * FileName：UserMapper.java
 * Description：用户Dao层
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
@Mapper
public interface UserMapper {

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
