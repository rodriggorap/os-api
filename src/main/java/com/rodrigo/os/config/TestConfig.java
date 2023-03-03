package com.rodrigo.os.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rodrigo.os.services.DBServices;

@Configuration
@Profile("test")
public class TestConfig {

	
	@Autowired
	private DBServices dbService;
	
	@Bean
	public void instanciaDB() {
		this.dbService.instaciaDB();
	}
}
