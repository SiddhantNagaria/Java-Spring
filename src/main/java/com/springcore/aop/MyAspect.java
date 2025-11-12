package com.springcore.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* com.springcore.aop.service.PaymentService.makePayment(..))")
    public void printBefore(){
        System.out.println("[BEFORE] payment started....");
    }

    @After("execution(* com.springcore.aop.service.PaymentService.makePayment(..))")
    public void printAfter(){
        System.out.println("[AFTER] payment done....");
    }
}
