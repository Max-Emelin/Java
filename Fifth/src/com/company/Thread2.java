package com.company;

public class Thread2 extends Thread {
    GameLibrary gl;
    public Thread2(GameLibrary gl){
        this.gl=gl;
    }
    @Override
    public void run() {
        for (int i = 0; i < gl.GetSize(); i++) {
            System.out.println("Read: " + gl.GetElementInArray(i) + " from position " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
