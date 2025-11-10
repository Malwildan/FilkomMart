package com.mb1.praktikum2;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.print("Masukkan jam kerja: ");
            int jamkerja = scan.nextInt();

            int batas_maksimal = 60;
            int batas_minimal = 50;

            int upah;
            int upah_lembur = 0;
            int denda = 0;

            if (jamkerja > batas_maksimal) {
                upah = batas_maksimal * 5000;
                int jumlah_lembur = jamkerja - batas_maksimal;
                upah_lembur = jumlah_lembur * 6000;
            } else {
                upah = jamkerja * 5000;
            }

            System.out.printf("%-10s= Rp. %d%n", "Upah", upah);

            if (jamkerja > batas_maksimal) {
                System.out.printf("%-10s= Rp. %d%n", "Lembur", upah_lembur);
            } else {
                System.out.printf("%-10s= Rp. %d%n", "Lembur", 0);
            }

            if (jamkerja < batas_minimal) {
                int jumlah_denda = batas_minimal - jamkerja;
                denda = jumlah_denda * 1000;
                System.out.printf("%-10s= Rp. %d%n", "Denda", denda);
            } else {
                System.out.printf("%-10s= Rp. %d%n", "Denda", 0);
            }

            int total = (upah + upah_lembur) - denda;

            System.out.println("---------------------");
            System.out.printf("%-10s= Rp. %d%n%n", "Total", total);
        
    }
}
