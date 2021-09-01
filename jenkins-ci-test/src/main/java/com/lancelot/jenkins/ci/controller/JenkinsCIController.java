package com.lancelot.jenkins.ci.controller;

import com.lancelot.jenkins.ci.entity.User;
import com.lancelot.jenkins.ci.service.IJenkinsCIService;
import com.lancelot.jenkins.ci.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ChenKang
 * Date: 2021-09-01 下午 3:02
 * Desc:
 */
@RestController("/")
public class JenkinsCIController {

//    @Autowired
//    IJenkinsCIService jenkinsCIService;

    @Autowired
    private UserService userService;

    @RequestMapping
    public String index(){
        return "Hello World!";
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> listUser(){
        List<User> list = new ArrayList<>();
        list.add(new User("张三",1));
        list.add(new User("李四",2));
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getInfo(@PathVariable("userId") Integer userId){
        User user  = userService.findByUserId(userId);
        return new ResponseEntity(user,HttpStatus.OK);
    }

}
