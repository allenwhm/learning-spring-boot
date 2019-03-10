package com.allenwhm;

import com.allenwhm.storage.StorageProperties;
import com.allenwhm.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by : allenwhm
 * DateTime : 2019-03-10 17:00
 * https://spring.io/guides/gs/uploading-files/
 **/
@SpringBootApplication
// @SpringBootApplication == @Configuration + @EnableAutoConfiguration + @EnableWebMvc + @ComponentScan
@EnableConfigurationProperties(StorageProperties.class)
public class UploadFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadFileApplication.class, args);
    }

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args -> {
            storageService.deleteAll();
            storageService.init();
        });
    }
}