package com.zjh.rabbitmqtest;

import com.zjh.rabbitmqtest.entity.Student;
import com.zjh.rabbitmqtest.service.Sender;
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
 * @date 2019/2/28 14:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitTest {

    @Autowired
    private Sender sender;

    @Test
    public void test(){
        sender.sendStudentName("zjh");
    }

    @Test
    public void test2(){
        Student student = new Student(1,"zjh",20);
        sender.sendStudent(student);
    }
}
