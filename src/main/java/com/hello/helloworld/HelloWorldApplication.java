package com.hello.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RestController
@SpringBootApplication
public class HelloWorldApplication {
    private static final Logger logger = LogManager.getLogger(HelloWorldApplication.class);

    @Value("${greeting}")
    private String greeting;

    @RequestMapping("/")
    String home() {
        return "Welcome Springboot Application!";
    }

    @RequestMapping("/greet")
    String greet() {
        logger.info("Welcome Springboot application");
        logger.info("Greetings");
        logger.debug("greetings value from config map");
        return greeting;
    }

    @RequestMapping("/demo")
    String demo() {
        logger.info("log from mraapp in demo page");
        return "Demo application!";
    }

    @RequestMapping("/contact")
    String contact() {
        logger.info("log from mraapp in contact page");
        return "Contact me!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}