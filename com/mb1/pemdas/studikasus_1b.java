package com.mb1.pemdas;

import java.util.Scanner;

public class studikasus_1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Masukkan nilai: ");
        double nilai = scan.nextDouble();

        String nilai_akhir;

        if (nilai >= 80) {
            nilai_akhir = "A";
        } else if (nilai > 74.9) {
            nilai_akhir = "B+";
        } else if (nilai >= 70) {
            nilai_akhir = "B";
        } else if (nilai > 64.9) {
            nilai_akhir = "C+";
        } else if (nilai >= 60) {
            nilai_akhir = "C";
        } else if (nilai > 54.9) {
            nilai_akhir = "D+";
        } else if ( nilai >= 40) {
            nilai_akhir = "D";
        } else {
            nilai_akhir = "E";
        }

        System.out.println("Nilaimu adalah " + nilai_akhir);
    }
}
