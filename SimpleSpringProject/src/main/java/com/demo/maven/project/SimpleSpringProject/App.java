package com.demo.maven.project.SimpleSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        System.out.println( "Hello World!" );
        Student s1 = (Student) ac.getBean("student");
        System.out.println(s1);
        Student s2 = (Student) ac.getBean("student");
        System.out.println(s2);
    }
}
