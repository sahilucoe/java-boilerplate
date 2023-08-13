package com.liffey.datasync.scheduler.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.liffey.datasync.scheduler.service.HelloService;

public class HelloJob implements Job {

    private HelloService helloService = new HelloService();

    public void execute(JobExecutionContext context) throws JobExecutionException {
        helloService.sayHello();
    }
}