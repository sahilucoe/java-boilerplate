package com.liffey.datasync.api.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith( SpringRunner.class )
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void sayHelloTest() {
        String output = helloService.sayHello();
        Assert.assertEquals(output, "hi");
    }
}
