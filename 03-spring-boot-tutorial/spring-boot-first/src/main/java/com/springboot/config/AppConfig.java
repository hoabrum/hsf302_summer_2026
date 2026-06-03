package com.springboot.config;

import com.springboot.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    //@Scope("prototype")
    public Student student() {
        return new Student(100, "Tom Cruise", 45);
    }
}
