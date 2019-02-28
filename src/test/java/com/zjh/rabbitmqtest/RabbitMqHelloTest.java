package com.zjh.rabbitmqtest;

import com.zjh.rabbitmqtest.hello.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/2/27 15:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello(){
        helloSender.send();
    }

}
