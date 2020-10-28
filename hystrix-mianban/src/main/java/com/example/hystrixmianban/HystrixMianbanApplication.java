package com.example.hystrixmianban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixMianbanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixMianbanApplication.class, args);
	}

}
