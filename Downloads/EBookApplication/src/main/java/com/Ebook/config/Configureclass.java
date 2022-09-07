package com.Ebook.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Configureclass { 
	@Configuration
	    public class WebMvcConfiguration implements WebMvcConfigurer {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**").
	            allowedOrigins("*").
	            allowedMethods("*").
	            allowedHeaders("*").
	            allowCredentials(true);
	        }
	    }
}
