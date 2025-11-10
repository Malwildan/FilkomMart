package com.mb1.pemdas;

import java.util.Scanner;

public class test {
    public static void main(String[] Args){
        
        // double ip = 0;
        //String kategori = null;
        
        Scanner scan = new Scanner(System.in);
        
        int jumlah_pemain = scan.nextInt();
        
        String[] nama = new String [jumlah_pemain];
        int[][] kda = new int [jumlah_pemain][3];
        double[] ip = new double[jumlah_pemain];
        String[] kategori = new String[jumlah_pemain];
        
        for (int i = 0; i < jumlah_pemain; i++){
            nama[i] = scan.next();
                int bonus = 0;

                kda[i][0] = scan.nextInt();
                kda[i][1] = scan.nextInt();
                kda[i][2] = scan.nextInt();
                
                if(kda[i][0] > (2 * kda[i][1]) ){
                    bonus = 15;
                }
                if(kda[i][0] > kda[i][1]){
                    bonus = 10;
                }
                if(kda[i][0] == kda[i][1]){
                    bonus = 5;
                }
                else {
                    bonus = 0;
                }
                
                //System.out.print(((2*25) + 10) / Math.sqrt(5+1) + 15);
                System.out.println("bonus "+bonus);
                System.out.println(kda[i][1]);
                System.out.println(kda[i][2]); 
                
                
                ip[i] = ((2 * kda[i][0]) + kda[i][2]) / (Math.sqrt(kda[i][1] + 1) + bonus);
                
                if(ip[i] >= 100){
                    kategori[i] = "MVP";
                }
                if(ip[i] >= 70){
                    kategori[i] = "Pro Player";
                }
                if(ip[i] >= 40){
                    kategori[i] = "Average";
                }
                if(ip[i] < 40){
                    kategori[i] = "Needs Practice";
                }
            
        }
        
        double temp = ip[0];
        String top = nama[0];
        double total_ip = 0;
        
        for ( int i = 0; i < jumlah_pemain; i++){
            System.out.printf("%s %.2f %s%n", nama[i], ip[i], kategori[i]);
            total_ip += ip[i];
            if ( ip[i] > temp ) {
                temp = ip[i];
                top = nama[i];
            }
            
        }
        
        double rata2_ip = total_ip / jumlah_pemain;
        
        System.out.println("Top Player: " + top);
        System.out.printf("%s: %.2f", "Rata-rata", rata2_ip);
        
        
    }
}