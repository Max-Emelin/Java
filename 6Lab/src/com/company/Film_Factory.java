package com.company;

public class Film_Factory implements Factory {
    public FilmLibrary createInstance() {
        return new FilmLibrary();
    }
}
