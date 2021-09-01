package com.lancelot.jenkins.ci.service;

import com.lancelot.jenkins.ci.entity.User;

/**
 * Author: ChenKang
 * Date: 2021-09-01 下午 3:36
 * Desc:
 */
public interface IUserService {
    User findByUserId(Integer userId);
}
