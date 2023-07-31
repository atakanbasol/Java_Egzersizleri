//Kullanıcıdan alınan iki sayıdan büyük olanını konsola basan kod
package com.example.java_egzersizleri;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayısıyı girin: ");
        int a = scanner.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("Büyük olan sayı: " + a);
        } else if (a<b) {
            System.out.println("Büyük olan sayı: " + b);
        }else {
            System.out.println("İki sayı eşit!");
        }

    }
}
