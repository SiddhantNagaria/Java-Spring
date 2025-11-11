package com.springcore.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext con =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = con.getBean("temp", Student.class);
        System.out.println(student);
        student.study();
    }
}

//When Spring calls getStudent(),
//it internally calls getSamosa() to get a Samosa object.
//Then it creates a new Student object by passing that Samosa to the constructor.
//The Student bean is stored in the container with the names "student", "temp", and "bean".