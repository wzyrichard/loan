package com.hnzx.loan.service.impl;

import com.hnzx.loan.enums.BusinessEnum;
import com.hnzx.loan.exception.BusinessException;
import com.hnzx.loan.mapper.UserMapper;
import com.hnzx.loan.model.User;
import com.hnzx.loan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * FileName：UserServiceImpl.java
 * Description：用户服务实现类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
@Service
public class UserServiceImpl implements IUserService {

    /**
     * 依赖注入用户Dao层
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Transactional
    @Override
    public int saveUser(User user) {
        int result = 0;
        if (StringUtils.isEmpty(user)) {
            throw new BusinessException(BusinessEnum.REQUEST_NULL);
        }
        try {
            result = userMapper.saveUser(user);
        } catch (Exception e) {
            throw new BusinessException(BusinessEnum.FAIL);
        }
        return result;
    }

    /**
     * 查找用户
     * @param userId
     * @return
     */
    @Override
    public User findUserById(Long userId) {
        if (StringUtils.isEmpty(userId)) {
            throw new BusinessException(BusinessEnum.REQUEST_NULL);
        }
        User user = null;
        try {
            user = userMapper.findUserById(userId);
        } catch (Exception e) {
            throw new BusinessException(BusinessEnum.FAIL);
        }
        return user;
    }

    /**
     * 查找所有用户
     * @return
     */
    @Override
    public List<User> findAllUser() {
        return null;
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @Transactional
    @Override
    public int updateUser(User user) {
        return 0;
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @Transactional
    @Override
    public int deleteUser(Long userId) {
        return 0;
    }
}
