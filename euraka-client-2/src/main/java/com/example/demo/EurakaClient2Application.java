package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EurakaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurakaClient2Application.class, args);
	}

	@Bean
	@LoadBalanced //to use the service ID not to concentrate on host and port number
	public RestTemplate template() {
		return new RestTemplate();
	}

}
