//package com.allenwhm.controller;
//
//import com.allenwhm.consumingRest.Girl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.*;
//
///**
// * @author allenwhm
// * @date 2018/3/25 20:48
// * @description
// */
////@Controller
////@ResponseBody
//@RestController
//@RequestMapping("/go")
//public class HelloController {
//
//    @Autowired
//    private Girl girl;
//
//    @Value("${boyName}")
//    private String boyName;
//
////    @RequestMapping(value = "/hello", method = RequestMethod.GET)
////    @PostMapping(value = {"/hello", "/hi"})
//    // use Postman to test Post method
//    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
//    public String hello(@PathVariable Integer id) {
////        return girl.getCupSize();
//        return "id is " + id;
////        return "index";
//    }
//
//    @RequestMapping(value = "/hi", method = RequestMethod.GET)
//    public String hi(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return "id is " + id;
//    }
//}
//
//
