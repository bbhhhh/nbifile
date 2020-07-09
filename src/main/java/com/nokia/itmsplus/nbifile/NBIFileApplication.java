package com.nokia.itmsplus.nbifile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;

/**
 * @Project: nbifile
 * @Author : haihuab
 * @Date : 2020/6/12 9:48
 * @Description: TODO
 */
@SpringBootApplication
@EnableJms
public class NBIFileApplication {
    private static final Logger logger = LoggerFactory.getLogger(NBIFileApplication.class);


    public static void main(String[] args) {
        // Launch the application
        ConfigurableApplicationContext context = SpringApplication.run(NBIFileApplication.class, args);


    }
}
