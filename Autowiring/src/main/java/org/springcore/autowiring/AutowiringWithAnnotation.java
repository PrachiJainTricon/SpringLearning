package org.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiringWithAnnotation {
    //@Autowired // autowire on property
    private Address address;

    public Address getAddress() {
        return address;
    }


     // @Autowired // autowire with setter
    public void setAddress(Address address) {
        System.out.println("setter injection");
        this.address = address;
    }

    public AutowiringWithAnnotation() {
    }

    @Autowired // autowire with constructor
    public AutowiringWithAnnotation(Address address) {
        super();
        System.out.println("constructor injection");
        this.address = address;
    }

    @Override
    public String toString() {
        return "AutowiringByXml{" +
                "address=" + address +
                '}';
    }
}
