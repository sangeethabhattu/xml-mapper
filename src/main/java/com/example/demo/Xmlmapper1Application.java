package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
@Configuration 
@MapperScan("com.example.demo.dao")
@SpringBootApplication
public class Xmlmapper1Application {

	public static void main(String[] args) {
		SpringApplication.run(Xmlmapper1Application.class, args);
	}

}
