package com.springboot.newtry;

import com.springboot.newtry.Security.SecurityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class NewtryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewtryApplication.class, args);
	}

}
