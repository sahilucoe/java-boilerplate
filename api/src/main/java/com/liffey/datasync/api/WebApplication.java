package com.liffey.datasync.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(WebApplication.class);
        logger.info("Hello from WebApplication !!");
        SpringApplication.run(WebApplication.class, args);
    }
}