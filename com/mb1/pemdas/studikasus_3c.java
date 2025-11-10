package com.mb1.pemdas;

import java.util.Scanner;

public class studikasus_3c {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan jumlah barang dibeli: ");
        int n = scan.nextInt();

        String[] nama = new String[n];
        int[] jumlahbarang = new int[n];
        double[] hargabarang = new double[n];

        for (int i = 1; i <= n; i++){
            System.out.println("Barang ke- "+i);
            System.out.print("Masukkan nama barang: ");
            nama[i-1] = scan.next();

            System.out.print("Masukkan jumlah: ");
            jumlahbarang[i-1] = scan.nextInt();

            System.out.print("Masukkan harga satuan: ");
            hargabarang[i-1] = scan.nextDouble();
        }

        System.out.println("Total Belanja");

        double totalharga = 0;

        for (int i = 0; i < n; i++){
            double totalbelanja = jumlahbarang[i] * hargabarang[i];
            totalharga += totalbelanja;

            System.out.println((i + 1) + "." + nama[i] + " x" + jumlahbarang[i] + " Rp." + hargabarang[i] + " = " + totalbelanja);
        }

        System.out.println("");
        System.out.println("Total yang harus dibayar: Rp." + totalharga);
    }
}
