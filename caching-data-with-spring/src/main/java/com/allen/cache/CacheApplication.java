package com.allen.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author allen
 * @date 2021/5/19 21:55
 *
 * https://spring.io/guides/gs/caching/
 */

@EnableCaching
@SpringBootApplication
public class CacheApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(CacheApplication.class);

    private final BookRepository bookRepository;

    public CacheApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("fetching books...");
        LOG.info("isbn-1234" + bookRepository.getByIsbn("isbn-1234"));
        LOG.info("isbn-4567" + bookRepository.getByIsbn("isbn-4567"));
        LOG.info("isbn-1234" + bookRepository.getByIsbn("isbn-1234"));
        LOG.info("isbn-4567" + bookRepository.getByIsbn("isbn-4567"));


    }
}
