package com.example.Annotation.Annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Annotation.Annotation.TestBean;

@Configuration
public class BeanConfig {

    @Bean
    public TestBean testBean(){
        return new TestBean();
    }
}
