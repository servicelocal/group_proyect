package com.group2.com.group_proyect;

import com.group2.com.group_proyect.Customer.model.entity.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GroupProyectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GroupProyectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Date d = new Date(2010, 10, 10, 20, 10, 00);
		Customer c = new Customer(1, "32156478", "Juan", "López", "av siemore viva", d, "viva@gmail.com", "321456789");*/

	}
}
