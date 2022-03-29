package com.company;

public class Thread1 extends Thread{
    GameLibrary gl;
    public Thread1(GameLibrary gl){
        this.gl=gl;
    }
    @Override
    public void run(){
        for(int i=0;i<gl.GetSize();i++){
            int a =(int)(1+Math.random()*10);
            gl.SetElementInArray(i,a);
            System.out.println("Write: " + gl.GetElementInArray(i) + " to position " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
       }
    }
}
