package com.kgc.dubbo077.petprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgc.dubbo077.petprovider.mapper")
@SpringBootApplication
public class PetproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetproviderApplication.class, args);
	}

}
