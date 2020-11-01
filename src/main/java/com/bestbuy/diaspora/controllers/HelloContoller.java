package com.bestbuy.diaspora.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloContoller {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/")
    public String index() {
        logger.info("In hello");
        return "Greetings from Spring Boot!";
    }
}
