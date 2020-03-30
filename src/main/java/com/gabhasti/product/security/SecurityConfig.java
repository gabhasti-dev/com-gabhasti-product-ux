package com.gabhasti.product.security;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.gabhasti.product.config.Application;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final Logger log = LogManager.getLogger(SecurityConfig.class.getName());

	@Autowired
	private DataSource dataSource;

	/**
	 * this method will configure database for user authentication in conjuction
	 * with spring security.
	 * 
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		log.info("Security DB loading");
		auth.jdbcAuthentication().dataSource(dataSource);
		log.info("Security DB loaded");

		/*
		 * auth.inMemoryAuthentication()
		 * .withUser("maker").password(passwordEncoder().encode("Welcome@01")).roles(
		 * "MAKER") .and()
		 * .withUser("checker").password(passwordEncoder().encode("Welcome@01")).roles(
		 * "CHECKER");
		 */
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/static/**").permitAll().antMatchers("/templates/**").permitAll()
				.antMatchers("/app/dashboard").hasAnyRole("MAKER", "CHECKER").anyRequest().authenticated().and()
				.formLogin()

		;

	}

	@Bean
	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();

	}

}
