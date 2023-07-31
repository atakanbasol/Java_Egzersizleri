//Ekrana 10 defa programcinin adini yazan kod

package com.example.java_egzersizleri;

public class E4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "." + "Atakan Başol");
        }

    //İkinci Yol
        System.out.println("************************************************************************");

        int a = 1;
        while (a<=10){
            System.out.println(a + "." +"Ceren Mutlu");
            a++;
        }
    }
}
