// Girilen vize ve final notlarina gore öğrencinin dersten gecip gecmedigini bulan kod

package com.example.java_egzersizleri;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notunuzu girin:");
        float vize_notu = scanner.nextFloat();
        System.out.println("Final notunuzu girin:");
        float final_notu = scanner.nextFloat();

        double vize_ort = (vize_notu * 40) / 100;
        double final_ort = (final_notu * 60) / 100;
        double genel_ort = vize_ort + final_ort;

        System.out.println("Genel ortalamanız: " + genel_ort);

        if (genel_ort >= 65){
            System.out.println("Başarılı.");
        }else if (genel_ort < 65 && genel_ort >= 45) {
            System.out.println("Koşullu");
        } else if (genel_ort < 45) {
            System.out.println("Başarız.");
        }
    }
}
