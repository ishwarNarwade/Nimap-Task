package com.nimap2.nimap2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")

public class Nimap2Application {

	public static void main(String[] args) {
		SpringApplication.run(Nimap2Application.class, args);
	}

}
