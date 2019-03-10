//package com.allenwhm.application;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.scheduling.annotation.EnableScheduling;
//
////@SpringBootApplication
//// @SpringBootApplication == @Configuration + @EnableAutoConfiguration + @EnableWebMvc + @ComponentScan
////@EnableConfigurationProperties(StorageProperties.class)
////@EnableScheduling
//public class Application {
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
////    @Bean
////    CommandLineRunner init(StorageService storageService) {
////        return (args -> {
////            storageService.deleteAll();
////            storageService.init();
////        });
////    }
//}
