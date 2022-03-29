package com.company;

public class Main {

    public static void main(String[] args) {
        GameLibrary a=new GameLibrary(6,"Хорор",2,false);

        Thread1 thread1 = new Thread1(a);
        thread1.setPriority(8);
        thread1.start();
        Thread2 thread2 = new Thread2(a);
        thread2.setPriority(2);
        thread2.start();




        Synchronization hop = new Synchronization(a);
        RunnableWrite write = new RunnableWrite(hop);
        RunnableRead read = new RunnableRead(hop);
        Thread rw = new Thread(write);
        Thread rr = new Thread(read);
        rw.start();
        rr.start();




    }
}
