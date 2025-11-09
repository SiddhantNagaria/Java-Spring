package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("ci_config.xml");
        Person p1  = (Person) con.getBean("person");
        System.out.println(p1);
    }
}
