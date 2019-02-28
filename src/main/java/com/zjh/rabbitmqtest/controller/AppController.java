package com.zjh.rabbitmqtest.controller;

import com.zjh.rabbitmqtest.entity.Student;
import com.zjh.rabbitmqtest.service.Sender;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/2/28 15:06
 */
@RestController
@Api(value = "app")
public class AppController {

    private final Sender sender;

    @Autowired
    public AppController(Sender sender) {
        this.sender = sender;
    }

    @PostMapping("/sendStudent")
    @ApiOperation("发送学生信息")
    public void sendStudent(@ApiParam @RequestBody Student student){
        sender.sendStudent(student);
    }

}
