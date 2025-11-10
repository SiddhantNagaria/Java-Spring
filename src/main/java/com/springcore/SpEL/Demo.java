package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{2+56+43+1}")
    private int x;

    @Value("#{22+11}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(64)}")
    private double z;

    @Value("#{T(java.lang.Math).E}")
    private double e;

    @Value("#{new java.lang.String('Siddhant Nagaria')}")
    private String name;

    @Value("#{8!=3}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Demo{" + "x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name='" + name + '\'' + ", isActive=" + isActive + '}';
    }
}
