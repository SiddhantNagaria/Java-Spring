package com.springcore.scope_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("scope_bean.xml");

        // Prototype Scope Beans

        Student s1 =con.getBean("student", Student.class);
        System.out.println(s1.hashCode());
        Student s2 =con.getBean("student", Student.class);
        System.out.println(s2.hashCode());
    }
}
