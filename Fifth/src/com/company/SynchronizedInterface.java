package com.company;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

public class SynchronizedInterface  implements Interface, java.io.Serializable{
    int[] countInLibrarySection;
    int size;
    String theme;
    int finished;
    Interface inter;
    String type ="SynchronizedInterface";
    public SynchronizedInterface() {
        System.out.println("Создана пустая библиотека игр");
        this.theme = "Без темы";
    }
    public SynchronizedInterface(int size, String theme, int finished, boolean fill) {
        this.countInLibrarySection = new int[size];
        this.size = size;
        this.theme = theme;
        this.finished = finished;
        if (fill) {
            for (int i = 0; i < size; i++) {
                this.countInLibrarySection[i] = (int) (2 + Math.random() * 10);
            }
        }
    }

    public synchronized int GetElementInArray(int i) {
        return countInLibrarySection[i];
    }
    public synchronized void SetElementInArray(int i, int value) {
        System.out.println(this.countInLibrarySection[i]);
    }
    public synchronized void GetTheme() {
        System.out.println(this.theme);
    }
    public synchronized void SetTheme(String theme) {
        this.theme = theme;
    }
    public synchronized int GetSize() {
        return size;
    }
    public synchronized int NotFinished() {
        int notFinished = 0;
        for (int i = 0; i < size; i++) {
            notFinished += this.countInLibrarySection[i] - this.finished;
        }
        return notFinished;
    }
    public synchronized void PrintArray() {
        String print = "";
        for (int i = 0; i < size; i++) {
            print += countInLibrarySection[i] + " ";
        }
        System.out.println(print);
    }
    public synchronized void PrintInfo() {
        System.out.println("Info:");
        System.out.println("\tSize: " + this.size);
        System.out.println("\tTheme: " + this.theme);
        System.out.println("\tFinished: " + this.finished);
    }
    public synchronized String getType(){
        return this.type;
    }
    public synchronized void output(OutputStream out) throws IOException {
        byte[] bytes =this.theme.getBytes();
        out.write(bytes);
        out.flush();
    }
    public synchronized void write(Writer out) throws IOException {
        out.write(this.theme);
        out.flush();
    }
    @Override
    public synchronized String toString() {
        return "FilmLibrary{" +
                "countInLibrarySection=" + Arrays.toString(countInLibrarySection) +
                ", size=" + size +
                ", theme='" + theme + '\'' +
                ", finished=" + finished +
                '}';
    }
}
