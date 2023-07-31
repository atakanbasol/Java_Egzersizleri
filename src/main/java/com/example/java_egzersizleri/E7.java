//Klavyeden girilen sayi kadar (N) sayinin faktoryelini alan kod

package com.example.java_egzersizleri;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyelini almak istediğiniz sayıyı girin:");

        int n = scanner.nextInt();
        int fak = 1;

        for (int i = 1; i <= n; i++) {
            fak = fak * i;
        }
        System.out.println("Faktöriyelini aldığınız sayı = " + fak);
    }
}
