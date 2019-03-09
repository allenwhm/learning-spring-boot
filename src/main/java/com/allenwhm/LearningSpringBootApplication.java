package com.allenwhm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class LearningSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringBootApplication.class, args);
    }

    //learn spring boot with the guide https://spring.io/guides

    // https://github.com/spring-guides/gs-uploading-files

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args -> {
            storageService.deleteAll();
            storageService.init();
        });
    }
}
