package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class kczym {
    public static String  sprawdz(String imie)
    {
        String km;
        if(imie.charAt(imie.length()-1)=='a') km="K";
        else  km="M";
        return km;
    }
}
