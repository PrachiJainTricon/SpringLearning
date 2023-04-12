package com.springcore.lifecyclemethods;

public class LifeCycle {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setter");
        this.price = price;
    }

    public LifeCycle() {
        super();
    }

    @Override
    public String toString() {
        return "lifecycle{" +
                "price=" + price +
                '}';
    }

    public void init(){  // we can change the name but signature must be same
        System.out.println("init method");
    }
    public void destroy(){ // we can change the name but signature must be same
        System.out.println("destroy method");
    }
}
