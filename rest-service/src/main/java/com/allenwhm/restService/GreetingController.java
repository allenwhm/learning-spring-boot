package com.allenwhm.restService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author allenwhm
 * @date 2018/3/27 22:56
 * @description https://spring.io/guides/gs/rest-service/
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World", required = false) String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
