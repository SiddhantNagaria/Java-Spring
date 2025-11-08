package com.springcore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("Collection_config.xml");

        System.out.println("Bean using Collection");
        Emp e1 = (Emp) con.getBean("Student");
        System.out.println(e1);
        System.out.println(e1.getName());
        System.out.println(e1.getAddress());
        System.out.println(e1.getCourses());
        System.out.println(e1.getPhones());
        System.out.println(e1.getInfo());
    }
}
