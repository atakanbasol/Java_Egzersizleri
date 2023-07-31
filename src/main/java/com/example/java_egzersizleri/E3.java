//Verilen tamsayinin sifir, pozitif ya da negatif olup olmadiğini bulan kod
package com.example.java_egzersizleri;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz:");
        int sayi = scanner.nextInt();
        if (sayi > 0){
            System.out.println("Pozitif");
        } else if (sayi<0) {
            System.out.println("Negatif");
        }else {
            System.out.println("Sıfır");
        }
    }
}
