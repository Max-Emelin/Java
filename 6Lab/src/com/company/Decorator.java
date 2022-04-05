package com.company;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Decorator implements Interface{
    Interface info=null;
    Decorator(Interface inf){
        info=inf;
    }

    public int GetElementInArray(int i) {
        return info.GetElementInArray(i);
    }
    public void SetElementInArray(int i, int value) {
        try {
            throw new UnsupportedOperationException("нельзя изменить SetElementInArray");
        }
        catch (UnsupportedOperationException unsupportedOperationException){
            System.err.println(unsupportedOperationException.getMessage());
        }
    }
    public String GetTheme() {
        return info.GetTheme();
    }
    public void SetTheme(String theme) {
        try {
            throw new UnsupportedOperationException("нельзя изменить SetTheme");
        }
        catch (UnsupportedOperationException unsupportedOperationException){
            System.err.println(unsupportedOperationException.getMessage());
        }
    }
    public int GetSize() {
        return info.GetSize();
    }
    public int NotFinished() {

        return info.NotFinished();
    }
    public void PrintArray() {
        info.PrintArray();
    }
    public void PrintInfo() {
       info.PrintInfo();
    }
    public String getType(){
        return info.getType();
    }
    @Override
    public String toString() {
        return info.toString();
    }
    @Override
    public boolean equals(Object o) {
        return info.equals(o);
    }
    @Override
    public int hashCode() {
        return info.hashCode();
    }
    public void output(OutputStream out) throws IOException {
        info.output(out);
    }
    public void write(Writer out) throws IOException {
        info.write(out);
    }
    public Interface create(){
        return  new FilmLibrary();
    }
    public int[] arr(){
        return info.arr();
    }
}
