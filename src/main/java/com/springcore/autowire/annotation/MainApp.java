package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("autowire_annotation.xml");
        // autowire - byName
        Emp e = con.getBean("emp1", Emp.class);

         System.out.println(e);
    }
}
