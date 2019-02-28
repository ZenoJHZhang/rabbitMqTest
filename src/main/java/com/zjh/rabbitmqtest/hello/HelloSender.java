package com.zjh.rabbitmqtest.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/2/27 15:50
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello"+ new Date();
        System.out.println("Sender:"+context);
        this.amqpTemplate.convertAndSend("topic.a",context);
    }

}
