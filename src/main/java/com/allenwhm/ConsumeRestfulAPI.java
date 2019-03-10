package com.allenwhm;

import com.allenwhm.entity.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by : allenwhm
 * DateTime : 2019-03-10 11:37
 * https://spring.io/guides/gs/consuming-rest/
 **/
//@SpringBootApplication
public class ConsumeRestfulAPI {

    private static final Logger LOG = LoggerFactory.getLogger(ConsumeRestfulAPI.class);

    public static void main(String[] args) {
        /*RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        LOG.info(quote.toString());*/

        SpringApplication.run(ConsumeRestfulAPI.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            LOG.info(quote.toString());
        };
    }
}
