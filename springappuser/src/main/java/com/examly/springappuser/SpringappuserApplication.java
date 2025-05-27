package com.examly.springappuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringappuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappuserApplication.class, args);
	}

}
