package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

//    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

//    @Autowired
    public void setAddress(Address address) {
        System.out.println("setting value");
        this.address = address;
    }

    public Emp() {
    }

    @Autowired
    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" + "address=" + address + '}';
    }

}
