package com.liffey.datasync.scheduler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SchedulerApplication {

    public static void main(String[] args) {
        try {
            Logger logger = LogManager.getLogger(SchedulerApplication.class);
            logger.info("Hello from Logger !!");

            new JobManager().scheduleJobs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
