package com.company;

public class Main {

    public static void main(String[] args) {
        vector a = new vector(5);
        vector b =new vector(5);
        vector c;

        a.print();
        a.bubbleSort();
        a.print();

        System.out.println("\nGET 4: " + a.getEl(4));
        a.setEl(4, 110);
        System.out.println("SET 4 by 110: " + a.getEl(4));
        System.out.println("GET size: " + a.getSize());
        System.out.println("minEl: " + a.minEL());
        System.out.println("maxEL: " + a.maxEl());
        System.out.println("Euclidean_norm: "+a.euclidean_norm()+"\n");

        a.print();
        System.out.println("Multiplication by 10:");
        a.multiplication(10);
        a.print();

        System.out.println("\nVector b: ");
        b.print();
        System.out.println("SUM a+b: ");
        c=a.sum(b);
        c.print();
        System.out.println("Scalar product: "+a.scalarProduct(b));


    }
}
