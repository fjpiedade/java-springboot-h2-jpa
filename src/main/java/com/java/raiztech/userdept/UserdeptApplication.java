package com.java.raiztech.userdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.java.raiztech.userdept.entities")
@ComponentScan("com.java.raiztech.userdept.controllers")
public class UserdeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdeptApplication.class, args);
	}

}
