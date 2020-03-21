package com.gabhasti.product.config;

import java.text.NumberFormat;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@ComponentScan(basePackages = { "com.gabhasti.product.component", "com.gabhasti.product.security" })
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class.getName());
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		Runtime runtime = Runtime.getRuntime();

		final NumberFormat format = NumberFormat.getInstance();

		final long maxMemory = runtime.maxMemory();
		final long allocatedMemory = runtime.totalMemory();
		final long freeMemory = runtime.freeMemory();
		final long mb = 1024 * 1024;
		final String mega = " MB";

		logger.info("========================== Memory Info ==========================");
		logger.info("Free memory: " + format.format(freeMemory / mb) + mega);
		logger.info("Allocated memory: " + format.format(allocatedMemory / mb) + mega);
		logger.info("Max memory: " + format.format(maxMemory / mb) + mega);
		logger.info("Total free memory: " + format.format((freeMemory + (maxMemory - allocatedMemory)) / mb) + mega);
		logger.info("=================================================================\n");
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		// dataSource.setUrl("jdbc:postgresql://192.168.39.133:30432/gabhasti");
		dataSource.setUrl("jdbc:postgresql://postgres.dev:5432/gabhasti");
		dataSource.setUsername("devgabhasti");
		dataSource.setPassword("devgabhasti");

		return dataSource;
	}

}
