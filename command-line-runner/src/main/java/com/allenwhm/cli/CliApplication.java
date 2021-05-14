package com.allenwhm.cli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CliApplication {

    public static void main(String[] args) {
        SpringApplication.run(CliApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("=> inspect the beans provided by Spring Boot");
            String[] beans = ctx.getBeanDefinitionNames();
            Arrays.sort(beans);
//            Arrays.sort(beans, Collections.reverseOrder()); // sort desc
            Arrays.stream(beans).forEach(System.out::println);
        };
    }
}
