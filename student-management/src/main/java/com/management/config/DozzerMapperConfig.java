package com.management.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozzerMapperConfig {

	@Bean
	public Mapper dozzerMapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		return mapper;
	}

}
