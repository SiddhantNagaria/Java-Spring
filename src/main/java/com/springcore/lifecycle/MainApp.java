package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext con = new ClassPathXmlApplicationContext("lifecycle.xml");
        Samosa s = (Samosa) con.getBean("s1");
        System.out.println(s);
        //  Registering shutdown Hook
        con.registerShutdownHook();

        System.out.println("------------------------");
        Pepsi p1 = (Pepsi)  con.getBean("pepsi1");
        System.out.println(p1);

    }
}
