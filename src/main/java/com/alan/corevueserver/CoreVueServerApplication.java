package com.alan.corevueserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.alan"})
public class CoreVueServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreVueServerApplication.class, args);
	}

}
