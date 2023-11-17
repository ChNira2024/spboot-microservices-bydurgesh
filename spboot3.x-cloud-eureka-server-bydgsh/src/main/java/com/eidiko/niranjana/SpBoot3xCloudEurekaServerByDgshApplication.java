package com.eidiko.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpBoot3xCloudEurekaServerByDgshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpBoot3xCloudEurekaServerByDgshApplication.class, args);
		
		
	}

}
