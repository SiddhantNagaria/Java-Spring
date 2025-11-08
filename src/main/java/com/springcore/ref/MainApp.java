package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("ref_config.xml");
        A temp = (A)con.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);
    }
}
