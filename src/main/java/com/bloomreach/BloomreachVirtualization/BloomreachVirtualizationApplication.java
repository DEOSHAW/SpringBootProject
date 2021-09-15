package com.bloomreach.BloomreachVirtualization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bloomreach.BloomreachVirtualization")
public class BloomreachVirtualizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloomreachVirtualizationApplication.class, args);
	}

}
