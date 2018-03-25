package com.allenwhm.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author allenwhm
 * @date 2018/3/25 20:48
 * @description
 */
@Controller
@ResponseBody
public class HelloController {

    @Autowired
    private Girl girl;

    @Value("${boyName}")
    private String boyName;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public String hello() {
        return girl.getCupSize();
//        return "index";
    }
}


