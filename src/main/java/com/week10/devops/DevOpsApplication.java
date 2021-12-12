package com.week10.devops;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsApplication.class, args);
		System.out.println("Hello World");
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello Dev-Ops");
		
	}

}
