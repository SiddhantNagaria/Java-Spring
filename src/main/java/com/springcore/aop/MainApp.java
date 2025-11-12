package com.springcore.aop;

import com.springcore.aop.service.PaymentService;
import com.springcore.aop.service.PaymentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext con = new ClassPathXmlApplicationContext("aop.xml");
        PaymentService paymentObject =  con.getBean("payment", PaymentService.class);

        //auth, paymentStarted
        paymentObject.makePayment();


    }
}
