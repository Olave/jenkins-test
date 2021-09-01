package com.lancelot.jenkins.ci.service.impl;

import com.lancelot.jenkins.ci.entity.User;
import com.lancelot.jenkins.ci.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Author: ChenKang
 * Date: 2021-09-01 下午 3:36
 * Desc:
 */
@Service
public class UserService implements IUserService {

    @Override
    public User findByUserId(Integer userId) {
        return new User("用户" + userId, userId);
    }
}
