package com.store.Project0_2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.store")
@EntityScan("com.store.entity")
@EnableJpaRepositories("com.store.repository")
public class Project02024Application {

	public static void main(String[] args) {
		SpringApplication.run(Project02024Application.class, args);
	}

}
