package com.company;

public class Main {

    public static void main(String[] args) {
        Interface []info=new Interface[]{
                new FilmLibrary(6,"w",2,true),
                new GameLibrary(6,"w",2,true)
        };
        Iterrator i = new Iterrator(info[0]);
      while (i.hasNext()) {
          System.out.println(i.next());
      }
        info[0].PrintArray();
        System.out.println(MegaClass.unmodifiable(info[0]).GetTheme());
        MegaClass.unmodifiable(info[1]).SetTheme("qwe");
        MegaClass.SetFactory("Film");
        Interface ii=MegaClass.createInstance();
        System.out.println(ii);
    }
}
