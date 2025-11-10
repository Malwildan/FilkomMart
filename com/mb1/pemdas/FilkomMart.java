package com.mb1.pemdas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class FilkomMart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("#,###", symbols);

        // Daftar harga barang
        String[] daftarBarang = {"Beras", "Gula", "MinyakGoreng", "Sabun", "Telur"};
        int[] hargaBarang = {55000, 10000, 56000, 15000, 2500};

        System.out.print("Masukkan Nama Staff: ");
        String staf = input.next();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBeli = input.nextInt();
        input.nextLine();

        String[] namaBarang = new String[jumlahBeli];
        int[] jumlahBarang = new int[jumlahBeli];
        int[] hargaSatuan = new int[jumlahBeli];

        for (int i = 0; i < jumlahBeli; i++) {
            System.out.print("Nama Barang " + (i + 1) + " : ");
            namaBarang[i] = input.next();

            System.out.print("Jumlah Barang " + (i + 1) + " : ");
            jumlahBarang[i] = input.nextInt();

        
            hargaSatuan[i] = 0;
            for (int j = 0; j < daftarBarang.length; j++) {
                if (namaBarang[i].equalsIgnoreCase(daftarBarang[j])) {
                    hargaSatuan[i] = hargaBarang[j];
                    break;
                }
            }
            if (hargaSatuan[i] == 0) {
                System.out.print("Masukkan harga barang " + namaBarang[i] + " : ");
                hargaSatuan[i] = input.nextInt();
            }
        }

    
        int subtotal = 0;
        for (int i = 0; i < jumlahBeli; i++) {
            subtotal += hargaSatuan[i] * jumlahBarang[i];
        }

        double diskonPersen = 0;
        if (subtotal >= 500000) {
            diskonPersen = 0.2;
        } else if (subtotal >= 100000) {
            diskonPersen = 0.1;
        } else if (subtotal >= 50000) {
            diskonPersen = 0.05;
        }

        int diskon = (int) (subtotal * diskonPersen);
        int totalBayar = subtotal - diskon;

        System.out.print("Jumlah pembayaran: ");
        int bayar = input.nextInt();
        int kembalian = bayar - totalBayar;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.forLanguageTag("id-ID"));
        DateTimeFormatter formatJam = DateTimeFormatter.ofPattern("HH.mm");

        System.out.println();
        System.out.println("                FILKOM-MART");
        System.out.println("              JL VETERAN MALANG");
        System.out.println("              TELP. 0341-577911");

        String tanggal = now.format(formatTanggal);
        String jam = now.format(formatJam);
        System.out.printf("%-32s %s\n", tanggal, jam);

        System.out.println("Receipt Number :                 150901");
        System.out.println("Order ID       :                 FM001");
        System.out.println("Collected by   :                 " + staf);
        System.out.println("==========================================");

        for (int i = 0; i < jumlahBeli; i++) {
            System.out.println(namaBarang[i]);
            System.out.printf("%-3s%12s%25s\n",
                    jumlahBarang[i] + "x",
                    "@" + df.format(hargaSatuan[i]),
                    df.format(hargaSatuan[i] * jumlahBarang[i]));
        }

        System.out.println("==========================================");
        System.out.printf("Subtotal%21sRp. %8s\n", "", df.format(subtotal));

        if (diskon > 0) {
            System.out.println("Diskon");
            System.out.printf("%-3s%24s- Rp. %7s\n",
                    (int) (diskonPersen * 100) + "%",
                    "",
                    df.format(diskon));
        }

        System.out.println("==========================================");
        System.out.printf("Total%24sRp %9s\n", "", df.format(totalBayar));
        System.out.printf("Bayar%24sRp %9s\n", "", df.format(bayar));
        System.out.println("==========================================");
        System.out.printf("Kembali%20s  Rp %8s\n", "", df.format(kembalian));
        System.out.println("==========================================");

        System.out.println("       Terima Kasih Telah Berbelanja di");
        System.out.println("                FILKOM-MART");

        input.close();
    }
}
