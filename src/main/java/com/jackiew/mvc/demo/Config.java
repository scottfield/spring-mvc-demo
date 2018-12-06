package com.jackiew.mvc.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@ComponentScan(basePackages = "com.jackiew.mvc.demo")
public class Config {
    @Bean
    public HandlerMapping getHandlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    @Bean
    public HandlerAdapter getHandlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }
}
