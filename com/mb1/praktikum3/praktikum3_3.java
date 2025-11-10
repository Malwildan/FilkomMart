package com.mb1.praktikum3;

import java.util.Scanner;

public class praktikum3_3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        boolean status = true;

        while (status){
        System.out.println("MENU");
        System.out.println("0. KELUAR");
        System.out.println("1. HITUNG VOLUME BALOK");
        System.out.println("2. HITUNG VOLUME BOLA");
        System.out.println("3. HITUNG VOLUME KERUCUT");
        System.out.println("4. HITUNG VOLUME SILINDER");
        System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
        System.out.println();
        System.out.print("MASUKKAN PILIHAN ANDA: ");
        int input = scan.nextInt();
        System.out.println();

        switch (input) {

            case 0 :
                System.out.println("ANDA TELAH KELUAR DARI PROGRAM");
                status = false;
                break;

            case 1 :
                System.out.println("=== HITUNG VOLUME BALOK ===");
                System.out.print("MASUKKAN PANJANG BALOK: ");
                int panjang_balok = scan.nextInt();

                System.out.print("MASUKKAN LEBAR BALOK: ");
                int lebar_balok = scan.nextInt();

                System.out.print("MASUKKAN TINGGI BALOK: ");
                int tinggi_balok = scan.nextInt();

                int volume_balok = panjang_balok * lebar_balok * tinggi_balok;
                System.out.println();
                System.out.println("VOLUME BALOK: " + volume_balok);
                System.out.println("===========================");
                System.out.println();
                break;

            case 2 :
                System.out.println("=== HITUNG VOLUME BOLA ===");
                System.out.print("MASUKKAN JARI-JARI BOLA: ");
                int jarijari_bola = scan.nextInt();

                int volume_bola = (4/3) * (22/7) * jarijari_bola * jarijari_bola * jarijari_bola;

                System.out.println("VOLUME BOLA: " + volume_bola);
                System.out.println("===========================");
                System.out.println();
                break;

            case 3 :
                System.out.println("=== HITUNG VOLUME KERUCUT ===");
                System.out.print("MASUKKAN JARI-JARI KERUCUT: ");
                int jarijari_kerucut = scan.nextInt();

                System.out.print("MASUKKAN TINGGI KERUCUT: ");
                int tinggi_kerucut = scan.nextInt();

                int volume_kerucut = (1/3) * (22/7) * jarijari_kerucut * jarijari_kerucut * tinggi_kerucut;

                System.out.println("VOLUME KERUCUT: " + volume_kerucut);
                System.out.println(  "===========================");
                System.out.println(); 
                break;

            case 4 : 
                System.out.println("=== HITUNG VOLUME SILINDER ===");
                System.out.print("MASUKKAN JARI-JARI KERUCUT: ");
                int jarijari_silinder = scan.nextInt();

                System.out.print("MASUKKAN TINGGI SILINDER: ");
                int tinggi_silinder = scan.nextInt();

                int volume_silinder = (22/7) * jarijari_silinder * jarijari_silinder * tinggi_silinder;

                System.out.println("VOLUME SILINDER: " + volume_silinder);
                System.out.println("===========================");
                System.out.println(); 
                break;
            
            case 5 :
                System.out.println("=== HITUNG VOLUME LIMAS SEGITIGA ===");
                System.out.print("MASUKKAN LUAS ALAS LIMAS: ");
                int luas_limas = scan.nextInt();

                System.out.print("MASUKKAN TINGGI LIMAS: ");
                int tinggi_limas = scan.nextInt();

                int volume_limas = (1/3) * luas_limas * tinggi_limas;

                System.out.println("VOLUME LIMAS: " + volume_limas);
                System.out.println("===========================");
                System.out.println(); 
                break;

            default:
                throw new AssertionError();
        }
        }    

    }
}
