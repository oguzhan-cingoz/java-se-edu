package com.cingoz;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        System.out.println("Lütfen yaşınızı giriniz:");
        Scanner sc = new  Scanner(System.in);
        int yas = sc.nextInt();

        int secmenYasi=18;
        if (yas>secmenYasi){
            System.out.println("EVET");

        }else{
            System.out.println("HAYIR");

        }

    }
}
