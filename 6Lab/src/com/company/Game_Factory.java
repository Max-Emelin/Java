package com.company;

public class Game_Factory implements Factory {
    public GameLibrary createInstance() {
        return new GameLibrary();
    }
}
