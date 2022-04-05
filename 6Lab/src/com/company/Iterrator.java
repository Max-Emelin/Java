package com.company;

import java.util.Iterator;

public class Iterrator implements Iterator<Integer> {
    private int start = 0;
    private int stop;
    private  Interface in;
    int[] arr = null;
    public Iterrator(Interface i) {
        in = i;
        stop = i.GetSize();
        arr=i.arr();
    }
    private int current = 0;
    @Override
    public boolean hasNext() {
        return current < stop;
    }

    @Override
    public Integer next() {
        return arr[current++];
    }

}