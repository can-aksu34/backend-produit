package com.alten.product_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Scanne les composants à partir de cette classe
@SpringBootApplication(scanBasePackageClasses = ProductManagementApplication.class)
public class ProductManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementApplication.class, args);
	}

}
