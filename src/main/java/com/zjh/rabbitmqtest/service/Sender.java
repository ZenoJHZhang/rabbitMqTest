package com.zjh.rabbitmqtest.service;

import com.zjh.rabbitmqtest.entity.Student;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消息发送者
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/2/28 14:12
 */
@Service
public class Sender {


    private final AmqpTemplate amqpTemplate;

    @Autowired
    public Sender(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendStudentName(String name){
        amqpTemplate.convertAndSend("testExchange","woniu.zjh",name);
    }

    public void sendStudent(Student student){
        amqpTemplate.convertAndSend("testExchange","woniu.1111",student);
    }

}
