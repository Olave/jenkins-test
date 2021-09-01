package com.lancelot.jenkins.ci;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Author: ChenKang
 * Date: 2021-09-01 下午 3:41
 * Desc: 启动服务器对Controller进行测试：
 *       这种方式是通过将TestRestTemplate注入进来，进行发送请求测试，
 *       缺点是需要启动服务器
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JenkinsCITest01 {

    //使用@LocalServerPort将端口注入进来
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        Assert.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",String.class),
        Matchers.containsString("Hello World"));
    }

}
