package com.spring.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SMPT implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Email Sent to employees");
		
	}

}
