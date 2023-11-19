package com.cingoz;

public class AppMain {
    public static void main(String[] args){


        // a+b =30

        int a = 25;
        int b =10;
        int c= a+b;

        float sonuc = (float) a/b; //casting (tipi dönüştürme)

        System.out.println(c);
        System.out.println(sonuc);
        System.out.println((a<b));

        // Ternary Operator 3'lü operatör
        System.out.println( (a>b) ? "Evet" :"Hayır" );

    }

}