package com.allen.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author allen
 * @date 2021/5/20 11:55
 */

@RestController
@SpringBootApplication
public class RoutingAndFilteringBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoutingAndFilteringBookApplication.class, args);
    }

    @RequestMapping("/available")
    public String available() {
        return "Spring Boot in action";
    }

    @RequestMapping("/checked-out")
    public String checkedOut() {
        return "Sping in action";
    }
}
