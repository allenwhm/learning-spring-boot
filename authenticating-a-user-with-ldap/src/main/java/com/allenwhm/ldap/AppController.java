package com.allenwhm.ldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: allenwhm
 * @date: 2020/3/23 0:45
 */
@RestController
public class AppController {

	@GetMapping("/")
	public String index() {
		return "Welcome to home page";
	}
}
