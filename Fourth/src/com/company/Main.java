package com.company;

import java.io.*;


public class Main  {

    public static void main(String[] args) throws Exception  {
        FileOutputStream out1 = new FileOutputStream("A:/Test/text1.txt");
        FileWriter out2 = new FileWriter("A:/Test/text2.txt");
        FileInputStream in1 = new FileInputStream("A:/Test/text1.txt");
        BufferedReader in2 = new BufferedReader(new FileReader("A:/Test/text2.txt"));

        FilmLibrary film=new FilmLibrary(6,"Хорор",2,true);

        film.output(out1); //ввод в файл1 темы
        film.write(out2); //ввод в файл2 темы

        MegaClass.output(film,out1); //ввод в файл1 остального
        MegaClass.write(film,out2); //ввод в файл2 остального

        System.out.println(MegaClass.input(in1));
        System.out.println(MegaClass.readInterface(in2)+"\n\n");

        ObjectOutputStream outo = new ObjectOutputStream(new FileOutputStream("A:/Test/1.ser"));
        ObjectInputStream ino = new ObjectInputStream(new FileInputStream("A:/Test/1.ser"));
        MegaClass.serializeInterface(film, outo);
        Interface it = MegaClass.deserializeInterface(ino);
        System.out.println(it);




    }
}
