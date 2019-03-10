package com.allenwhm.controller;

import com.allenwhm.entity.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author allenwhm
 * @date 2018/3/27 22:56
 * @description https://spring.io/guides/gs/rest-service/
 */
@RestController // @RestController == @Controller + @ResponseBody
public class GreetingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();    // AtomicLong

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)    // @GetMapping("/greeting") == @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World", required = false) String name) { // @RequestParam
        return new Greeting(counter.incrementAndGet(), String.format(template, name)); // String.format(template, name)
    }
}