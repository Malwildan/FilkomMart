package com.mb1.pemdas.studikasus5a;

public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Buku Tulis", 5000, 10);
        Barang barang2 = new Barang("Pensil", 2000, 15);

        System.out.println("Nama Barang: " + barang1.getNamaBarang());
        System.out.println("Harga Satuan: " + barang1.getHargaSatuan());
        System.out.println("Jumlah Barang: " + barang1.getJumlahBarang());
        System.out.println("Total Harga: " + barang1.hitungTotalHarga());

        System.out.println();

        System.out.println("Nama Barang: " + barang2.getNamaBarang());
        System.out.println("Harga Satuan: " + barang2.getHargaSatuan());
        System.out.println("Jumlah Barang: " + barang2.getJumlahBarang());
        System.out.println("Total Harga: " + barang2.hitungTotalHarga());
    }
}
