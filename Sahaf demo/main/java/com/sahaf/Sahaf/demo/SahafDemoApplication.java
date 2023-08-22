package com.sahaf.Sahaf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.sahaf.Sahaf.demo.model") 
public class SahafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SahafDemoApplication.class, args);
	}

}
