package com.springcore;

import com.springcore.dao.StudentDAO;
import com.springcore.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //StudentDAO studentDAO = ctx.getBean("studentDAO", StudentDAO.class);
        //studentDAO.search("John");
        StudentService studentService = ctx.getBean("studentService", StudentService.class);
        studentService.reportInfo("Tom Cruise");
    }
}
