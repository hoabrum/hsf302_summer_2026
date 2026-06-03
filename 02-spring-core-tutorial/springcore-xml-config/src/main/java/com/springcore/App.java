package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Student st1 = (Student)ctx.getBean("student");
        //System.out.println(st1);

        Student st2 = (Student)ctx.getBean("student");
        //System.out.println(st2);

        Student st3 = (Student)ctx.getBean("student");
        //System.out.println(st3);

        //StudentDAO studentDAO = (StudentDAO)ctx.getBean("studentDAO");
        //studentDAO.search("Learning Java in 21 days");
    }
}
