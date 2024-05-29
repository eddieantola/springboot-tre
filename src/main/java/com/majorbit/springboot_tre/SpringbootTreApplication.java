package com.majorbit.springboot_tre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.majorbit.springboot_tre")
public class SpringbootTreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTreApplication.class, args);
	}

}
