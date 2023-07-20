package com.endava.java2023Project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.endava.java2023Project.Repository")
public class Java2023ProjectApplication {
	public static void main(String[] args) {
			SpringApplication.run(Java2023ProjectApplication.class, args);

	}
}
