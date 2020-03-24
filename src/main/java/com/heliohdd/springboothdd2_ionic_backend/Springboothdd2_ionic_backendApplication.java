package com.heliohdd.springboothdd2_ionic_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.heliohdd.springboothdd2_ionic_backend.services.S3Service;

@SpringBootApplication
public class Springboothdd2_ionic_backendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springboothdd2_ionic_backendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}