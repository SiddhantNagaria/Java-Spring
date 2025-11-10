package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("stereotype.xml");
        Student student =con.getBean("ob",Student.class);
        System.out.println(student);
    }
}
