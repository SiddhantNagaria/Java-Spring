package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("using setter injection");
        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);
        System.out.println("using value as attribute");
        Student s2 = (Student) context.getBean("s1");
        System.out.println(s2);
        System.out.println("using p Schema");
        Student s3 = (Student) context.getBean("s2");
        System.out.println(s3);
    }
}
