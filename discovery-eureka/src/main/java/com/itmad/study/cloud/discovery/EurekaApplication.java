package com.itmad.study.cloud.discovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Gabriel.Ge on 2017-02-28.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    private final static Logger LOGGER = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        LOGGER.info("SpringApplication start!!!");
    }
}
