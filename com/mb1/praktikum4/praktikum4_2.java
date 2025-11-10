//NAMA : Muhammad Akmal Wildannov
//NIM : 255150400111009

package com.mb1.praktikum4;

import java.util.Scanner;

public class praktikum4_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean status = true;

        String[] header = {"Jenis", "Harga", "Diskon", "AC", "Colokan"};

        String[][] kereta = {
            {"Ekonomi", "Bisnis", "Eksekutif", "Pariwisata"},
            {"50000", "100000", "200000", "300000"},
            {"2%", "5%", "7%", "10%"},
            {"Tidak Ada", "Ada", "Ada", "Ada"},
            {"Tidak Ada", "Tidak Ada", "Tidak Ada", "Ada"}
        };

        

        while (status) {

            System.out.println("1. Melihat Daftar Kereta Api\n"
                    + "2. Melihat Daftar Kereta Api yang ada AC\n"
                    + "3. Melihat Daftar Kereta Api yang ada Colokan\n"
                    + "4. Memesan Tiket Kereta Api\n"
                    + "5. Melihat Pesanan Tiket\n"
                    + "0. Keluar");

            System.out.print("Masukkan menu: ");
            int input = scan.nextInt();

                String[] pesananJenis = new String[100];
                int[] pesananJumlah = new int[100];
                int[] pesananHarga = new int[100];
                double[] pesananTotal = new double[100];
                int jumlahPesanan = 0;

            switch (input) {
                case 1:
                    System.out.println("+-------------------------------------------------------+");
                    System.out.printf("| %s |\n", String.format("%-55s", "DAFTAR KERETA API"));
                    System.out.println("+-------------------------------------------------------+");

                    System.out.println("+------------+---------+--------+-----------+-----------+");
                    System.out.printf("| %-10s | %-7s | %-6s | %-9s | %-9s |\n", 
                            header[0], header[1], header[2], header[3], header[4]);
                    System.out.println("+------------+---------+--------+-----------+-----------+");

                    for (int i = 0; i < kereta[0].length; i++) {
                        System.out.printf("| %-10s | %-7s | %-6s | %-9s | %-9s |\n",
                                kereta[0][i], kereta[1][i], kereta[2][i], kereta[3][i], kereta[4][i]);
                    }

                    System.out.println("+------------+---------+--------+-----------+-----------+");
                break;

                case 2:
                    System.out.println("+-------------------------------------------------------+");
                    System.out.printf("| %s |\n", String.format("%-55s", "DAFTAR KERETA API BER-AC"));
                    System.out.println("+-------------------------------------------------------+");

                    System.out.println("+------------+---------+--------+-----------+-----------+");
                    System.out.printf("| %-10s | %-7s | %-6s | %-9s | %-9s |\n", 
                            header[0], header[1], header[2], header[3], header[4]);
                    System.out.println("+------------+---------+--------+-----------+-----------+");

                    for (int i = 0; i < kereta[0].length; i++) {
                        if (kereta[3][i].equalsIgnoreCase("Ada")){
                        System.out.printf("| %-10s | %-7s | %-6s | %-9s | %-9s |\n",
                                kereta[0][i], kereta[1][i], kereta[2][i], kereta[3][i], kereta[4][i]);
                        }
                    }

                    System.out.println("+------------+---------+--------+-----------+-----------+");
                break;

                case 3:
                    System.out.println("+-------------------------------------------------------+");
                    System.out.printf("| %s |\n", String.format("%-55s", "DAFTAR KERETA API DENGAN COLOKAN"));
                    System.out.println("+-------------------------------------------------------+");

                    System.out.println("+------------+---------+--------+-----------+-----------+");
                    System.out.printf("| %-10s | %-7s | %-6s | %-9s | %-9s |\n", 
                            header[0], header[1], header[2], header[3], header[4]);
                    System.out.println("+------------+---------+--------+-----------+-----------+");

                    for (int i = 0; i < kereta[0].length; i++) {
                        if (kereta[4][i].equalsIgnoreCase("Ada")) {
                        System.out.printf("| %-10s | %-7s | %-6s | %-9s | %-9s |\n",
                                kereta[0][i], kereta[1][i], kereta[2][i], kereta[3][i], kereta[4][i]);
                        }
                    }

                    System.out.println("+------------+---------+--------+-----------+-----------+");
                break;

                case 4:
                    boolean status_pesan = true;
                    int harga = 0;
                    double diskon = 0;
                    double totalAkhir = 0;
                    int harga_sebelum_diskon = 0;
                    int numpuk = 0;

                    while (status_pesan) {
                        System.out.print("Masukkan jumlah tiket: ");
                        int jumlah_tiket = scan.nextInt();

                        System.out.print("Pilih tiket berdasarkan jenis: ");
                        String jenis_tiket = scan.next();

                        boolean ditemukan = false;
                        for (int k = 0; k < kereta[0].length; k++) {
                            if (jenis_tiket.equalsIgnoreCase(kereta[0][k])) {
                                ditemukan = true;

                                // Title Box
                                System.out.println("+-------------------------------------------------------+");
                                System.out.printf("| %s |\n", String.format("%-55s", "DETAIL TIKET"));
                                System.out.println("+-------------------------------------------------------+");

                                // Table Header
                                System.out.println("+------------+---------+--------+-----------+-----------+");
                                System.out.printf("| %-10s | %-7s | %-6s | %-9s | %-9s |\n",
                                        header[0], header[1], header[2], header[3], header[4]);
                                System.out.println("+------------+---------+--------+-----------+-----------+");

                                // Ticket Row
                                System.out.printf("| %-10s | %-7s | %-6s | %-9s | %-9s |\n",
                                        kereta[0][k], kereta[1][k], kereta[2][k], kereta[3][k], kereta[4][k]);
                                System.out.println("+------------+---------+--------+-----------+-----------+");

                                // Calculations
                                harga = Integer.parseInt(kereta[1][k]);
                                String diskonStr = kereta[2][k].replace("%", "");
                                diskon = Double.parseDouble(diskonStr) / 100.0;
                                harga_sebelum_diskon = harga * jumlah_tiket;
                                double totalDiskon = harga_sebelum_diskon * diskon;
                                totalAkhir = harga_sebelum_diskon - totalDiskon;
                                numpuk += totalAkhir;

                                // Print Detail Section
                                System.out.printf("Jumlah Tiket: %d\n", jumlah_tiket);
                                System.out.printf("Harga per Tiket: %d\n", harga);
                                System.out.printf("Total Sebelum Diskon: %d\n", harga_sebelum_diskon);
                                System.out.printf("Diskon: %.1f\n", totalDiskon);
                                System.out.printf("Total Akhir: %.1f\n", totalAkhir);
                                System.out.println("=======================================================");
                                System.out.printf("TOTAL KESELURUHAN PESANAN: %.1f\n", (double) numpuk);
                                System.out.println("=======================================================");

                                pesananJenis[jumlahPesanan] = kereta[0][k];
                                pesananJumlah[jumlahPesanan] = jumlah_tiket;
                                pesananHarga[jumlahPesanan] = harga;
                                pesananTotal[jumlahPesanan] = totalAkhir;
                                jumlahPesanan++;

                                System.out.print("Pesan lagi? (y/n): ");
                                String close = scan.next();

                                if (!close.equalsIgnoreCase("y")) {
                                    status_pesan = false;
                                }

                                break;
                            }
                        }

                        if (!ditemukan) {
                            System.out.println("Tiket tidak ditemukan");
                            System.out.print("Lanjut (y/n): ");
                            String lanjut = scan.next();
                            if (lanjut.equalsIgnoreCase("n")) {
                                status_pesan = false;
                            }
                        }
                    }
                break;


                case 5:
                    if (jumlahPesanan == 0) {
                        System.out.println("Belum ada pesanan tiket.");
                    } else {
                        System.out.println("+-------------------------------------------------------+");
                        System.out.printf("| %s |\n", String.format("%-55s", "DAFTAR PESANAN TIKET"));
                        System.out.println("+-------------------------------------------------------+");

                        // Header table
                        System.out.println("+------------+------------+---------------+---------------+");
                        System.out.printf("| %-10s | %-10s | %-13s | %-13s |\n",
                                "Jenis", "Jumlah", "Harga/Tiket", "Total Bayar");
                        System.out.println("+------------+------------+---------------+---------------+");

                        double totalKeseluruhan = 0;
                        for (int i = 0; i < jumlahPesanan; i++) {
                            System.out.printf("| %-10s | %-10d | %-13d | %-13.1f |\n",
                                    pesananJenis[i],
                                    pesananJumlah[i],
                                    pesananHarga[i],
                                    pesananTotal[i]);
                            totalKeseluruhan += pesananTotal[i];
                        }

                        System.out.println("+------------+------------+---------------+---------------+");
                        System.out.printf("| %-24s %-27s %.1f |\n", " ", "TOTAL KESELURUHAN :", totalKeseluruhan);
                        System.out.println("+-------------------------------------------------------+");
                    }
                break;

                case 0:
                System.out.println("+-------------------------------------------------------+");
                    System.out.printf("| %s |\n", String.format("%-55s", "ANDA KELUAR DARI PROGRAM"));
                    System.out.println("+-------------------------------------------------------+");

                    status = false;

                break;

                default:
                    throw new AssertionError();
            }

        }

    }
}
