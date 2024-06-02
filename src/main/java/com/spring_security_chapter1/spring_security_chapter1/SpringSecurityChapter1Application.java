package com.spring_security_chapter1.spring_security_chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class SpringSecurityChapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityChapter1Application.class, args);
	}

}
