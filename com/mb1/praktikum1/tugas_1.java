package com.mb1.praktikum1;

import java.util.Scanner;

public class tugas_1 {

    static void printHasil(String kalimat, double hasil) {
        if (hasil % 1 == 0){
            System.out.printf("%-30s: %.0f%n", kalimat, hasil);
        } else {
            System.out.printf("%-30s: %.1f%n", kalimat, hasil);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.printf("%-30s: ", "Masukkan operator pertama");
        double operator1 = scan.nextDouble();

        System.out.printf("%-30s: ","Masukkan operator kedua");
        double operator2 = scan.nextDouble();

        double penjumlahan = operator1 + operator2;
        double pengurangan = operator1 - operator2;
        double perkalian = operator1 * operator2;
        double pembagian = operator1 / operator2;

        printHasil("Hasil penjumlahan", penjumlahan);
        printHasil("Hasil pengurangan", pengurangan);
        printHasil("Hasil perkalian", perkalian);
        printHasil("Hasil pembagian", pembagian);

        scan.close();
    }
}
