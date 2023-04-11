package org.springcore;

public class ReferenceA {
    private int x;
    private ReferenceB ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ReferenceB getOb() {
        return ob;
    }

    public void setOb(ReferenceB ob) {
        this.ob = ob;
    }

    public ReferenceA() {
        super();
    }

    @Override
    public String toString() {
        return "referenceA{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}
