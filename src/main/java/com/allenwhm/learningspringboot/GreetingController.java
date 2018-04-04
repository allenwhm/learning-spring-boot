package com.allenwhm.learningspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author allenwhm
 * @date 2018/3/27 22:56
 * @description https://spring.io/guides/gs/rest-service/
 */
@RestController
@RequestMapping("/hello")
public class GreetingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World", required = false) String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
