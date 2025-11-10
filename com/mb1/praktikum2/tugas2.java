package com.mb1.praktikum2;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double bb = scan.nextDouble();

        System.out.print("Masukkan tinggi (m): ");
        double tinggi = scan.nextDouble();

        double imt = bb / (tinggi * tinggi);

        String kategori = null;

        if (imt <= 18.5){
            kategori = "Kurus";
        } else if (imt > 18.5 && imt <= 25){
            kategori = "Normal";
        } else if (imt > 25 && imt <= 30){
            kategori = "Gemuk";
        } else if (imt > 30){
            kategori = "Kegemukan";
        }

        System.out.printf("%s %.2f %s %s","IMT =", imt, "Termasuk", kategori);

    }
}
