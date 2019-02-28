package com.zjh.rabbitmqtest.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/2/27 15:53
 */
@Component
@RabbitListener(queues = "topic.messages")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver:"+hello);
    }

}
