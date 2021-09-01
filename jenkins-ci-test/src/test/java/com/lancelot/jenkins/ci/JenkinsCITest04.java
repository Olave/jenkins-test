package com.lancelot.jenkins.ci;

import com.lancelot.jenkins.ci.controller.JenkinsCIController;
import com.lancelot.jenkins.ci.entity.User;
import com.lancelot.jenkins.ci.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * Author: ChenKang
 * Date: 2021-09-01 下午 4:50
 * Desc: @MockBean 模拟注入
 */
@RunWith(SpringRunner.class)
//使用@WebMvcTest只实例化Web层，而不是整个上下文。在具有多个Controller的应用程序中，
// 甚至可以要求仅使用一个实例化，例如@WebMvcTest(JenkinsCIController.class)
@WebMvcTest(JenkinsCIController.class)
public class JenkinsCITest04 {

    @Autowired
    private MockMvc mockMvc;

    //模拟出一个userService
    @MockBean
    private UserService userService;

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
        //模拟userService.findByUserId(1)的行为
        when(userService.findByUserId(1)).thenReturn(new User("张三", 1));

        String result = this.mockMvc.perform(get("/user/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.userName").value("张三"))
                .andReturn().getResponse().getContentAsString();

        System.out.println("result : " + result);
    }

}
