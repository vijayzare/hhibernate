package com.paytem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "com.paytem.repository")
@SpringBootApplication
public class One2OneApplication {

	public static void main(String[] args) {
		SpringApplication.run(One2OneApplication.class, args);
	}

}
