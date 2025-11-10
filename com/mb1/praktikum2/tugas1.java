package com.mb1.praktikum2;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        boolean status = true;
        String lanjut;

        while (status == true){

        System.out.println("===================================================");
        System.out.printf("%30s%n","Daftar Menu");
        System.out.println("===================================================");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.println("===================================================");
        System.out.println("press q to quit");
        System.out.println("===================================================");
        

        System.out.print("Pilihan anda: ");
        String pilihan = scan.next();
        System.out.println("");


            switch (pilihan) {
            case "1":
                System.out.printf("%-30s: ", "Masukkan panjang");
                double panjang = scan.nextDouble();

                System.out.printf("%-30s: ", "Masukkan lebar");
                double lebar = scan.nextDouble();

                System.out.println("");

                double luas_pp = panjang * lebar;

                if (luas_pp % 1 == 0){
                    System.out.printf("%-30s: %.0f %s%n", "Luas persegi panjang", luas_pp, "cm2");
                } else {
                    System.out.printf("%-30s: %.1f %s%n", "Luas persegi panjang", luas_pp, "cm2");
                }

                double keliling_pp = 2 * luas_pp;
                if (keliling_pp % 1 == 0){
                    System.out.printf("%s%.0f%s%n%n", "Keliling persegi panjang", keliling_pp, "cm");
                } else {
                    System.out.printf("%-30s: %.1f %s%n%n", "Keliling persegi panjang", keliling_pp, "cm");
                }

                System.out.println("lanjut? y/n");
                lanjut = scan.next();

                if (lanjut.equals("n")){
                    status = false;
                    System.out.println("==========================");
                    System.out.println("anda keluar dari program");
                    System.out.println("==========================");
                }

            break;

            case "2":
                System.out.printf("%-30s: ","Masukkan jari-jari");
                double r = scan.nextDouble();

                System.out.println("");

                double luas_lingkaran = 3.14 * r * r;
                if (luas_lingkaran % 1 == 0){
                    System.out.printf("%-30s: %.0f %s%n", "Luas lingkaran", luas_lingkaran, "cm2");
                } else {
                    System.out.printf("%-30s: %.1f %s%n", "Luas lingkaran", luas_lingkaran, "cm2");
                }

                double keliling_lingkaran = 2 * 3.14 * r;
                if (keliling_lingkaran % 1 == 0){
                    System.out.printf("%-30s: %.0f %s%n", "Keliling lingkaran", keliling_lingkaran, "cm");
                } else {
                    System.out.printf("%-30s: %.1f %s%n", "Keliling lingkaran", keliling_lingkaran, "cm");
                }

                System.out.println("lanjut? y/n");
                lanjut = scan.next();

                if (lanjut.equals("n")){
                    status = false;
                    System.out.println("==========================");
                    System.out.println("anda keluar dari program");
                    System.out.println("==========================");
                }

            break;

            case "3":
                System.out.printf("%-30s: ","Masukkan alas");
                double alas = scan.nextDouble();

                System.out.printf("%-30s: ", "Masukkan tinggi");
                double tinggi = scan.nextDouble();

                System.out.printf("%-30s: ","Masukkan sisi");
                double sisi = scan.nextDouble();

                System.out.println("");

                double luas_segitiga = 0.5 * alas * tinggi;
                if ( luas_segitiga % 1 == 0){
                    System.out.printf("%-30s: %.0f %s%n", "Luas segitiga", luas_segitiga, "cm2");
                } else {
                    System.out.printf("%-30s: %.1f %s%n", "Luas segitiga", luas_segitiga, "cm2");
                }

                double keliling_segitiga = sisi + sisi + sisi;
                if ( keliling_segitiga % 1 == 0){
                    System.out.printf("%-30s: %.0f %s%n%n", "Keliling segitiga", keliling_segitiga, "cm");
                } else {
                    System.out.printf("%-30s: %.1f %s%n%n", "Keliling segitiga", keliling_segitiga, "cm");
                }

                System.out.println("lanjut? y/n");
                lanjut = scan.next();

                if (lanjut.equals("n")){
                    status = false;
                    System.out.println("==========================");
                    System.out.println("anda keluar dari program");
                    System.out.println("==========================");
                }

            break;

            case "q":
                status = false;
                System.out.println("==========================");
                System.out.println("anda keluar dari program");
                System.out.println("==========================");
            break;

            default:
                System.out.println("!!! menu tidak ditemukan !!!");
                System.out.println(" ");

                System.out.println("lanjut? y/n");
                lanjut = scan.next();

                if (lanjut.equals("n")){
                    status = false;
                    System.out.println("==========================");
                    System.out.println("anda keluar dari program");
                    System.out.println("==========================");
                }

        }
        }        

        
    }
    
}
