package com.gabhasti.product.config;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@ComponentScan(basePackages= {"com.gabhasti.product.component","com.gabhasti.product.security"})
public class Application {

	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://192.168.39.133:30432/gabhasti");
		dataSource.setUsername("devgabhasti");
		dataSource.setPassword("devgabhasti");

		return dataSource;
	}

}
