package com.luizalabs.luizalabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LuizalabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuizalabsApplication.class, args);
	}

}
