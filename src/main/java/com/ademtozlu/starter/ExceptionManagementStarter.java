package com.ademtozlu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EntityScan(basePackages = {"com.ademtozlu"})
@EnableJpaRepositories(basePackages = {"com.ademtozlu"})
@ComponentScan(basePackages = {"com.ademtozlu"})
@EnableScheduling
@SpringBootApplication
public class ExceptionManagementStarter {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementStarter.class, args);
	}

}
