package com.springcore;

import com.springcore.dao.StudentDAO;
import com.springcore.dao.impl.StudentDAOImpl;
import com.springcore.service.StudentService;
import com.springcore.service.impl.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public StudentDAO studentDAO() {
        return new StudentDAOImpl();
    }

    @Bean
    public StudentService studentService() {
        return new StudentServiceImpl(studentDAO());
    }
}
