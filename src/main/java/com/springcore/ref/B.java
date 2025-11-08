package com.springcore.ref;

public class B {
    private int y;

    public B() {
    }

    public B(int y) {
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "B{" + "y=" + y + '}';
    }


}
