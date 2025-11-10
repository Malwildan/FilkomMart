package com.mb1.pemdas;

import java.util.Scanner;

public class method{
    public static void main(String[] Args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan angka 1: ");
        double angka1 = scan.nextDouble();

        System.out.print("Masukkan angka 2: ");
        double angka2 = scan.nextDouble();

        tambah(angka1, angka2);
        kurang(angka1, angka2);
        kali(angka1, angka2);
        bagi(angka1, angka2);

    }

    public static void tambah (double  angka1, double  angka2){
        double tambah = angka1 + angka2;

        System.out.println("Hasil tambah: "+tambah);
    }

    public static void kurang (double angka1, double angka2){
        double kurang = angka1 - angka2;

        System.out.println("Hasil kurang: "+kurang);
    }

    public static void kali (double angka1, double angka2){
        double kali = angka1 * angka2;

        System.out.println("Hasil kali: "+kali);
    }

    public static void bagi (double angka1, double angka2){
        double bagi = angka1 / angka2;

        System.out.println("Hasil bagi: "+bagi);
    }

    
}