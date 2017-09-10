package com.ernesttech.samdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SamDemoApplication.class, args);
	}

	public SamDemoApplication() {
		start();
	}

	private void start() {
		System.out.println("\n\n\nStarted\n\n\n\n");
	}
}
