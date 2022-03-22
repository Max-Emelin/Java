package com.company;

import java.util.Arrays;
import java.util.Objects;

public class FilmLibrary implements Interface {
    int[] countInLibrarySection;
    int size;
    String theme;
    int finished;
    String type ="Films";

    public FilmLibrary() {
        System.out.println("Создана пустая библиотека игр");
        this.theme = "Без темы";
    }
    public FilmLibrary(int size, String theme, int finished, boolean fill) {
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

    public void GetElementInArray(int i) {
       try{
            System.out.println(this.countInLibrarySection[i - 1]);
        }
       catch (IndexOutOfBoundsException e) {
           System.out.println("Неверно введен номер");
       }
    }
    public void SetElementInArray(int i, int value) {
        try{
            System.out.println(this.countInLibrarySection[i - 1]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Неверно введен номер");
        }
    }
    public void GetTheme() {
        System.out.println(this.theme);
    }
    public void SetTheme(String theme) {
        this.theme = theme;
    }
    public void GetSize() {
        System.out.println(size);
    }
    public int NotFinished() {
        int notFinished = 0;
        for (int i = 0; i < size; i++) {
            notFinished += this.countInLibrarySection[i] - this.finished;
        }
        return notFinished;
    }
    public void PrintArray() {
        String print = "";
        for (int i = 0; i < size; i++) {
            print += countInLibrarySection[i] + " ";
        }
        System.out.println(print);
    }
    public void PrintInfo() {
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
        return "FilmLibrary{" +
                "countInLibrarySection=" + Arrays.toString(countInLibrarySection) +
                ", size=" + size +
                ", theme='" + theme + '\'' +
                ", finished=" + finished +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FilmLibrary)) return false;
        FilmLibrary that = (FilmLibrary) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, theme, finished);
        result = 31 * result + Arrays.hashCode(countInLibrarySection);
        return result;
    }
}