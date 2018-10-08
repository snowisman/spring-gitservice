package com.donald.springgitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// JPA Auditing 활성화
@EnableJpaAuditing
@SpringBootApplication
public class SpringGitserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGitserviceApplication.class, args);
	}

}
