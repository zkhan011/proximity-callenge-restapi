package com.example.easyrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EasyRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyRestApplication.class, args);
	}
}
