package com.allenwhm.ldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: allenwhm
 * @date: 2020/3/23 0:44
 * guide: https://spring.io/guides/gs/authenticating-ldap/
 */
@SpringBootApplication
public class LdapApplication {
	public static void main(String[] args) {
		SpringApplication.run(LdapApplication.class, args);
	}
}
