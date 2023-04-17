package org.springcore.constrctorInjection;

import java.security.PublicKey;

public class Addition {
    private int a;
    private int b;

    public Addition(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("COnstrctor : int , int ");
    }

    public Addition(double a , double b){
        this.a = (int)a;
        this.b =(int) b;
        System.out.println("Constructor : double , double");

    }

//    if there is String param constructor then spring will run it first.
    public Addition(String a , String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor : String ,String");
    }

    public void sum(){
        System.out.println("a value : " + a);
        System.out.println("b value : " + b);
        System.out.println("Sum is = " + (this.a+this.b));

    }


}
