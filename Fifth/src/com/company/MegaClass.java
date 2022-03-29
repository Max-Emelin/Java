package com.company;

import java.io.*;


public class MegaClass {
    public static void output(Interface inter, OutputStream out) throws IOException {
        var data= inter.toString().getBytes();
        out.write(data);
        out.flush();
    }
    public static void write(Interface inter, Writer out)throws IOException{
        out.write(inter.toString());
        out.flush();
    }
    public static String input(InputStream in) throws IOException{
        byte bytes[] = new byte[in.available()];
        in.read(bytes);
        String str = new String(bytes);
        return str;
    }
    public static String readInterface(BufferedReader in) throws IOException{
        String str = in.readLine();
        return str;
    }

    public static void serializeInterface(Interface inter, ObjectOutputStream out) {
        try {
            out.writeObject(inter);
            out.close();
        } catch (IOException i){
            System.out.println("======================================");
            i.printStackTrace();
        }
    }
    public static Interface deserializeInterface(ObjectInputStream in) {
        try {
            Interface inter = null;
            inter = (Interface) in.readObject();
            in.close();
            return inter;
        } catch (IOException i) {
            System.out.println("------------------------");
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("интерфейс не найден");
            c.printStackTrace();
            return null;
        }
    }

    public static Interface Synchronization (){
        return (Interface) new SynchronizedInterface(5,"Хорор",2,true);
    }
}
