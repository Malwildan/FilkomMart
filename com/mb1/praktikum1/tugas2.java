package com.mb1.praktikum1;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Program penghitung pemakaian listrik sederhana");

        System.out.printf("%-35s: ", "Masukkan Nama");
        String nama = scan.next();

        System.out.printf("%-35s: ", "Kelurahan");
        String kelurahan = scan.next();

        System.out.printf("%-35s: ", "Masukkan posisi awal Kwh Meter");
        int kwh_awal = scan.nextInt();
        
        System.out.printf("%-35s: ", "Masukkan posisi akhir Kw Meter");
        int khw_akhir = scan.nextInt();

        System.out.printf("%-35s: ", "Masukkan biaya beban saaht ini");
        int beban_biaya = scan.nextInt();

        System.out.printf("%-35s: ", "Masukkan PPJ (dalam persen)");
        int pajak = scan.nextInt();

        System.out.println("===================PLN Java===================");

        System.out.printf("%-35s: %s%n", "Nama", nama);
        System.out.printf("%-35s: %s%n", "Kelurahan", kelurahan);

        int bulan_ini = khw_akhir - kwh_awal; 
        System.out.printf("%-35s: %d %s%n","Pemakaian bulan ini", bulan_ini, "Kwh Meter");

        int tarif = bulan_ini * beban_biaya;
        System.out.printf("%-35s: %s %d%s%n", "Tarif Listrik", "Rp", tarif, ",-");

        int ppj = (tarif*pajak) / 100;
        String kalimatppj = "PPJ " + pajak + "%";
        System.out.printf("%-35s: %s %d%s%n", kalimatppj, "Rp", ppj, ",-");

        int total = tarif + ppj;
        System.out.printf("%-35s: %s %d%s%n", "Total Bayar", "Rp", total, ",-");
        System.out.println("==============================================");

        scan.close();
    }
}

