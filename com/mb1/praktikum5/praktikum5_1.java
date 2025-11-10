package com.mb1.praktikum5;

import java.util.Scanner;

public class praktikum5_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean status = true;

        while(status){

            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");

            System.out.print("Masukkan pilihan anda: ");
            int pilihan = scan.nextInt();
            System.out.print("Masukkan nilai n: ");
            int n = scan.nextInt();
            System.out.print("Masukkan nilai r: ");
            int r = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("        n");
                    System.out.println("nPr = ----- = " + permutasi(n, r));
                    System.out.println("      (n-r)!");
                    System.out.println("Maka hasil permutasinya adalah " + permutasi(n, r));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("            n");
                    System.out.println("nCr = --------------= " + kombinasi(n, r));
                    System.out.println("       (n-r)! x r!");
                    System.out.println("Maka hasil kombinasi adalah " + kombinasi(n, r));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Anda telah keluar dari program");
                    status = false;
                    break;
                default:
                    throw new AssertionError();
            }

        }
        
    }

    public static int faktorial(int num){
        int hasil = 1;

        for (int i = 1; i <= num; i++){
            hasil *= i;
        }

        return hasil;
    }

    public static int permutasi(int n, int r){
        return faktorial(n) / faktorial(n - r);
    }

    public static int kombinasi(int n, int r){
        return faktorial(n) / (faktorial(n - r) * faktorial(r));
    }
    
    
}
