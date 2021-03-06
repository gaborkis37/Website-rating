package com.homeProj;

import java.util.Locale;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@SpringBootApplication
@EnableTransactionManagement
public class WebsiteRating {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteRating.class, args);
	}

	@Bean
	PrettyTime prettytime() {
		return new PrettyTime(new Locale(""));
	}

	@Bean
	public SpringSecurityDialect securityDialect() {
		return new SpringSecurityDialect();
	}
}
