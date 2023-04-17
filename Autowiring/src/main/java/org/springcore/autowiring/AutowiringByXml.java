package org.springcore.autowiring;

public class AutowiringByXml {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setter injection");
        this.address = address;
    }

    public AutowiringByXml() {
    }

    public AutowiringByXml(Address address) {
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
