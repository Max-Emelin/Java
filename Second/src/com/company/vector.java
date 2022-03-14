package com.company;

import java.util.Random;

public class vector {
    private int size;
    private float []arr;

    vector(int size) {
        Random random = new Random();
        this.size = size;
        arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public float getEl(int i) {return arr[i];}
    public void setEl(int i,int value) {arr[i]=value;}
    public int getSize(){return size;}
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public float minEL(){
        float min=arr[0];
        for(int i=0;i<size;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public float maxEl(){
        float max=arr[0];
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public void bubbleSort(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i]<arr[j]){
                    float tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
    public float euclidean_norm(){
        float result =0;
        for(int i=0;i<size;i++){
            result+=arr[i]*arr[i];
        }
        return (float) Math.sqrt(result);
    }
    public void multiplication(int value){
        for(int i=0;i<size;i++){
            arr[i]*=value;
        }
    }
    public vector sum(vector other){
        vector tmp=new vector(size);
        for(int i=0;i<size;i++){
            tmp.arr[i]=arr[i]+other.arr[i];
        }
        return tmp;
    }
    public float scalarProduct(vector other){
        float result=0;
        for(int i=0;i<size;i++){
            result+=arr[i]*other.arr[i];
        }
        return result;
    }
}