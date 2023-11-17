package com.eidiko.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpBoot3xCloudGatewayServiceConsumerByDgshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpBoot3xCloudGatewayServiceConsumerByDgshApplication.class, args);
	}

}
