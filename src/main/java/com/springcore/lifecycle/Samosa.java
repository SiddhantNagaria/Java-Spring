package com.springcore.lifecycle;


public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samosa{" + "price=" + price + '}';
    }

    public void init(){
        System.out.println("inside init method : Hey I am created");
    }
    public void destroy(){
        System.out.println("Inside destroy method : I am going to die. You can't saved me");
    }
}
