package com.lancelot.jenkins.ci;

import com.lancelot.jenkins.ci.controller.JenkinsCIController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Author: ChenKang
 * Date: 2021-09-01 下午 4:50
 * Desc: 下面的代码会报错，因为我们使用@WebMvcTest只初始化Controller层，但是在JenkinsCIController 中注入了UserService，所以报错。
 *       我们把 IUserService注释掉，则该测试就会成功了。　
 */
@RunWith(SpringRunner.class)
//使用@WebMvcTest只实例化Web层，而不是整个上下文。在具有多个Controller的应用程序中，
// 甚至可以要求仅使用一个实例化，例如@WebMvcTest(UserController.class)
@WebMvcTest(JenkinsCIController.class)
public class JenkinsCITest03 {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }

}
