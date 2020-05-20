package com.example.demo;

public class Greeting {
    private final long id;
    private final String imie;
    private final String wiek;

    public Greeting(long id, String imie, String wiek, String s) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }
    public long getId() {
        return id;
    }
    public String getImie() {
        return imie;
    }
    public String getWiek() {
        return wiek;
    }
}