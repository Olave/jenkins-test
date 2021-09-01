package com.lancelot.jenkins.ci.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Author: ChenKang
 * Date: 2021-09-01 下午 3:36
 * Desc:
 */
@Data
@AllArgsConstructor
public class User {
    private String userName;
    private Integer age;
}
