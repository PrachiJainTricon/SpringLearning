package com.springcore.lifecyclemethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ByInterface implements InitializingBean , DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ByInterface{" +
                "price=" + price +
                '}';
    }

    public ByInterface() {
    }

    @Override
    public void afterPropertiesSet() throws Exception { // it will work as init method()
        System.out.println("it will work as init method byInerface");
    }


    @Override
    public void destroy() throws Exception { // it will work as destroy method()
        System.out.println("it will work as destroy method for byInterface");
    }
}
