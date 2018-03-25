package com.allenwhm.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author allenwhm
 * @date 2018/3/25 20:48
 * @description
 */
@RestController
public class HelloController {

    @Autowired
    private Girl girl;

    @Value("${boyName}")
    private String boyName;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public String hello() {
//        return girl.getCupSize();
        return "index";
    }
}
