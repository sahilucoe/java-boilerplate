package com.liffey.datasync.api.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloControllerTest extends BaseControllerTest {
    @Autowired
    private HelloController controller;

    @Test
    public void getTest() {
        String output = controller.get();
        Assert.assertEquals(output,"hi");
    }
}
