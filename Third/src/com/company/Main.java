package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printInterface(Interface[] interfaces) {
        for (int i = 0; i < interfaces.length; i++) System.out.println(interfaces[i]);
    }

    public static void main(String[] args) {
        GameLibrary gl1 = new GameLibrary(8, "Хорор", 3, true);
        GameLibrary gl2 = new GameLibrary(4, "Боевик", 2, true);
        GameLibrary gl3 = new GameLibrary(5, "Приключение", 3, true);

        FilmLibrary fl1 = new FilmLibrary(4, "Боевик", 2, true);
        FilmLibrary fl2 = new FilmLibrary(6, "Хорор", 5, true);


        gl1.GetSize();
        gl1.GetTheme();
        gl1.PrintInfo();
        gl1.NotFinished();
        gl1.PrintArray();
        gl1.GetElementInArray(2);

        System.out.println("\n");

        Interface[] inter = new Interface[]{gl1, gl3, fl1, fl2, gl2};
        printInterface(inter);

        System.out.println("\n");

        List<Interface> newArray = new ArrayList<Interface>();
        for (int i = 0; i < inter.length; i++) {
            for (int j = 0; j < inter.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (inter[i].NotFinished() == inter[j].NotFinished()) {
                        newArray.add(inter[i]);
                        newArray.add(inter[j]);
                    }
                }
            }
        }


        List<Interface> Games = new ArrayList<Interface>();
        List<Interface> Films = new ArrayList<Interface>();
        for(int i=0;i<inter.length;i++){
            if(inter[i].getType()=="Games") {
                Games.add(inter[i]);
            } else {
                Films.add(inter[i]);
            }
        }
        System.out.println("Games:");
        System.out.println(Games);

        System.out.println();

        System.out.println("Films:");
        System.out.println(Films);
    }
}
