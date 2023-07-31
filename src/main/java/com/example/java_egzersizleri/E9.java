//Medyan degerini bulan kod.

package com.example.java_egzersizleri;

public class E9 {
    public static void main(String[] args) {
        int[] array = {7,65,23,5,1,65,5,95,8,5};

        float medyan;
        int n = array.length;

        if (n%2==1){
            medyan = array[(Math.round(n / 2))];
            System.out.println(medyan);
        }else {
            medyan = (array[n / 2 - 1] + array[n / 2]) / 2;
            System.out.println(medyan);
        }
    }
}
