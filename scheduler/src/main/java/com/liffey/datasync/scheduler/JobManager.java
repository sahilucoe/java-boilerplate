package com.liffey.datasync.scheduler;

import com.liffey.datasync.scheduler.job.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class JobManager {
    public void scheduleJobs() throws SchedulerException {
        JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("helloJob", "group1").build();

        Trigger trigger =
                TriggerBuilder.newTrigger()
                        .withIdentity("helloTrigger", "group1")
                        .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(1))
                        .build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
    }
}
