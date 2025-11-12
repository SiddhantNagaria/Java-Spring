package com.springcore.aop.service;

public class PaymentServiceImpl implements  PaymentService{
    @Override
    public void makePayment() {
        // payment code
        System.out.println("Amount debited");

        System.out.println("amount credited");
    }
}
