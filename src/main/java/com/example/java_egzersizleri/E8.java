//Klavyeden girilen Fahrenayt derecesini santigrata ceviren kod
package com.example.java_egzersizleri;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Fahrenayt derecesini giriniz :");
        double a=scanner.nextInt();
        double santigrad=((a-32.0)*5.0)/9.0;

        System.out.println(santigrad+" derece.");
    }
}

