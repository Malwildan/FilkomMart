package com.mb1.pemdas;

import java.util.Scanner;

public class studyclub1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Aplikasi pembelajaran siswa");
        System.out.print("Hitung luas persegi panjang");

        System.out.print("Masukkan panjang: ");
        double panjang = scan.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = scan.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}
