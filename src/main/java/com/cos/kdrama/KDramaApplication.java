package com.cos.kdrama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cos.kdrama.test"})

public class KDramaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KDramaApplication.class, args);
	}

}
