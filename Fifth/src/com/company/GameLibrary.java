package com.company;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

public class GameLibrary implements Interface, java.io.Serializable {
    int[] countInLibrarySection;
    int size;
    String theme;
    int finished;
    String type ="Games";

    public GameLibrary() {
        System.out.println("Создана пустая библиотека игр");
        this.theme = "Без темы";
    }
    public GameLibrary(int size, String theme, int finished, boolean fill) {
        this.countInLibrarySection = new int[size];
        this.size = size;
        this.theme = theme;
        this.finished = finished;
        if (fill) {
            for (int i = 0; i < size; i++) {
                this.countInLibrarySection[i] = (int) (2+Math.random() * 10);
            }
        }
    }

    public int GetElementInArray(int i) {
        return countInLibrarySection[i];
    }
    public void SetElementInArray(int i, int value) {
            this.countInLibrarySection[i] = value;
    }
    public void GetTheme(){
        System.out.println(this.theme);
    }
    public void SetTheme(String theme){
        this.theme=theme;
    }
    public int GetSize(){
        return  size;
    }
    public int NotFinished(){
       int notFinished=0;
       for(int i=0;i<size;i++){
           notFinished+=this.countInLibrarySection[i]-this.finished;
       }
        return notFinished;
    }
    public void PrintArray(){
        String print="";
        for(int i=0;i<size;i++){
            print+=countInLibrarySection[i]+" ";
        }
        System.out.println(print);
    }
    public void PrintInfo(){
        System.out.println("Info:");
        System.out.println("\tSize: " + this.size);
        System.out.println("\tTheme: " + this.theme);
        System.out.println("\tFinished: " + this.finished);
    }
    public String getType(){
        return this.type;
    }
    @Override
    public String toString() {
        return "GameLibrary{" +
                "countInLibrarySection=" + Arrays.toString(countInLibrarySection) +
                ", size=" + size +
                ", theme='" + theme + '\'' +
                ", finished=" + finished +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameLibrary)) return false;
        GameLibrary that = (GameLibrary) o;
        return Objects.equals(type, that.type);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(size, theme, finished);
        result = 31 * result + Arrays.hashCode(countInLibrarySection);
        return result;
    }

    ////start 4 lab:
    public void output(OutputStream out) throws IOException {
        byte[] bytes =this.theme.getBytes();
        out.write(bytes);
        out.flush();
    }
    public void write(Writer out) throws IOException {
        out.write(this.theme);
        out.flush();
    }
}
























