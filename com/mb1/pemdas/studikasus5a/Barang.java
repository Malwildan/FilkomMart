package com.mb1.pemdas.studikasus5a;

class Barang {
    private String namaBarang;
    private int hargaSatuan;
    private int jumlahBarang;

    public Barang(String namaBarang, int hargaSatuan, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaSatuan = hargaSatuan;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public double hitungTotalHarga() {
        return hargaSatuan * jumlahBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    
}
