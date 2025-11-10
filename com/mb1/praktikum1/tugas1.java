package com.mb1.praktikum1;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.printf("%-30s: ", "Masukkan operator pertama");
        double operator1 = scan.nextDouble();


        System.out.printf("%-30s: ","Masukkan operator kedua");
        double operator2 = scan.nextDouble();


        double penjumlahan = operator1 + operator2;
        System.out.printf("%-30s: %.1f%n", "Hasil penjumlahan", penjumlahan);


        double pengurangan = operator1 - operator2;
        System.out.printf("%-30s: %.1f%n", "Hasil pengurangan", pengurangan);


        double perkalian = operator1 * operator2;
        System.out.printf("%-30s: %.1f%n", "Hasil perkalian", perkalian);


        double pembagian = operator1 / operator2;
        System.out.printf("%-30s: %.1f%n", "Hasil pembagian", pembagian);


        scan.close();
    }
}