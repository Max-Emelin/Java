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



//6
    private static Factory<Interface> interFactory=null;

    public static void SetFactory(String name){
        if (name=="Film"){
            interFactory = new Film_Factory();
        }
        else if(name=="Game"){
            interFactory=new Game_Factory();
        }
    }
    public static void SetFactory(Interface name){
        if (name.getType()=="Film"){
            interFactory = new Film_Factory();
        }
        else if(name.getType()=="Game"){
            interFactory=new Game_Factory();
        }
    }

    public static Interface unmodifiable(Interface i) {
        return new Decorator(i);
    }
    public static Interface createInstance() {
        return interFactory.createInstance();
    }
}
