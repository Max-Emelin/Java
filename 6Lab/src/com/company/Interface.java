package com.company;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Iterator;

public interface Interface  {
    int GetElementInArray(int i);
    void SetElementInArray(int i, int value);
    public String GetTheme();
    void SetTheme(String theme);
    int GetSize();
    int NotFinished();
    void PrintArray();
    void PrintInfo();
    String getType();


    //start 4 lab:
    void output(OutputStream out) throws IOException;
    void write(Writer out)throws IOException;

    //start 6 lab:
    public Interface create();
    public int[] arr();
}
