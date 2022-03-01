package com.company;
import FirstPackage.*;

public class Main {
    public static void main(String[] args) {
        SecondClass second=new SecondClass();

        System.out.println(second.getA());
        System.out.println(second.getB());
        System.out.println();

        second.setA(10);
        second.setB(4);

        System.out.println(second.getA());
        System.out.println(second.getB());
        System.out.println();

        System.out.println(second.add());
        System.out.println(second.minusAB());
        System.out.println(second.minusBA());
        System.out.println(second.multiplication());
        System.out.println();
    }
}
