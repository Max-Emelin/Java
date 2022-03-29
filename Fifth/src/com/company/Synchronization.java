package com.company;

public class Synchronization {
    GameLibrary gl;
    volatile int current = 0;
    private volatile boolean isElSet = false;

    public Synchronization(GameLibrary gl){
        this.gl=gl;
    }
    public void write() throws InterruptedException {
        synchronized (gl) {
            while (isElSet) {
                gl.wait();
            }
            gl.SetElementInArray(current,(int) (4 + Math.random() * (20)));
            isElSet = true;
            System.out.println("Write: " + gl.GetElementInArray(current));
            gl.notifyAll();
        }
    }
    public void read() throws InterruptedException{
        synchronized (gl) {
            while (!isElSet) {
                gl.wait();
            }
            isElSet = false;
            System.out.println("Read: " + gl.GetElementInArray(current++));
            gl.notifyAll();
        }
    }
}
