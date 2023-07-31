//Klavyeden girilen fiyati, KDV(%18) ekleyerek ekrana yazdirin.

package com.example.java_egzersizleri;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz: ");
        double fiyat = scanner.nextDouble();

        double kdv = ((fiyat * 18.0) / 100.0) + fiyat;

        System.out.println("KDV eklendikten sonraki son fiyat: " + kdv + " TL.");
    }
}

