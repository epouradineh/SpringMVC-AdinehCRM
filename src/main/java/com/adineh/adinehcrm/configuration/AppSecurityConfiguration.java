package com.adineh.adinehcrm.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	protected DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(dataSource);
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.authorizeRequests().anyRequest().authenticated().and().formLogin()
//				.loginPage(null).loginProcessingUrl("/authenticationProcess").permitAll();
//	}

}
