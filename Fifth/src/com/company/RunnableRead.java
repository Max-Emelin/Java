package com.company;

public class RunnableRead implements Runnable {
    Synchronization s;

    public RunnableRead(Synchronization s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < s.gl.GetSize(); i++)
                s.read();
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }
    }
}