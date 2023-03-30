package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
    private ConfigReader configReader;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
    public void run(String... args) {
        System.out.println("Region = " + configReader.getRegion());
        System.out.println("Bucket = " + configReader.getBucket());
        System.out.println("file = " + configReader.getFile());
    }
}
