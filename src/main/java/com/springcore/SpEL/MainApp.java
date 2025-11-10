package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("SpEL.xml");
        Student student =con.getBean("ob",Student.class);

        //id will be 33 - from SpEL
        //city will be in UpperCase - from SpEL
        System.out.println(student);

        SpelExpressionParser temp = new SpelExpressionParser();
        Expression ex = temp.parseExpression("22+44");
        System.out.println(ex.getValue());
    }
}
