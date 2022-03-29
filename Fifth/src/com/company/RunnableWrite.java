package com.company;

public class RunnableWrite implements Runnable {
    Synchronization s;

    public RunnableWrite(Synchronization s){
        this.s = s;
    }

    @Override
    public void run(){
        try {
            for (int i = 0; i < s.gl.GetSize(); i++)
                s.write();
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }
    }
}
