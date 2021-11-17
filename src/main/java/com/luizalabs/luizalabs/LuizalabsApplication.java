package com.luizalabs.luizalabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//Com a anotação @EnableFeignClients, fica possível buscar pela interface client, que deve ser consumida
@EnableFeignClients
public class LuizalabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuizalabsApplication.class, args);
	}

}
