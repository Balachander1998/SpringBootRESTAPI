package com.mdrm.RESTAPIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mdrm")
public class RestapiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiDemoApplication.class, args);
	}

}
