package com.lancelot.jenkins.ci;

import com.lancelot.jenkins.ci.controller.JenkinsCIController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.notNullValue;

/**
 * Author: ChenKang
 * Date: 2021-09-01 下午 4:44
 * Desc: 测试 SpringBootTest Jenkins是否注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest //告诉SpringBoot去寻找主配置类(例如使用@SpringBootApplication注解标注的类)，并使用它来启动一个Spring application context;
public class JenkinsCITest {

    @Autowired
    private JenkinsCIController jenkinsCIController;

    //测试@SpringBootTest是否会将@Component加载到Spring application context
    @Test
    public void testContexLoads(){
        Assert.assertThat(jenkinsCIController,notNullValue());
    }


}
