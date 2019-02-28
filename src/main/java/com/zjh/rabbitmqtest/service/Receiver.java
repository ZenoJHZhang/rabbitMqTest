package com.zjh.rabbitmqtest.service;

import com.zjh.rabbitmqtest.entity.Student;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/2/28 14:24
 */
@Component
@RabbitListener(queues = "testQueue")
public class Receiver {

    @RabbitHandler
    public void receiverName(String name){
        System.out.println("Receiver"+name);
    }
    
    /**
     * @description 
     * @author 张江浩
     * @date 16:18 2019/2/28 
     * @param student
     * @return void 接收者不能有返回值
     */
    @RabbitHandler
    public void receiverStudent(Student student){
        System.out.println(student);
    }
}
