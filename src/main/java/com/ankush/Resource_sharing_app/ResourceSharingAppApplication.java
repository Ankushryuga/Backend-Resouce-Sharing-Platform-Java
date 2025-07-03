package com.ankush.Resource_sharing_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class 	ResourceSharingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceSharingAppApplication.class, args);
	}

}
