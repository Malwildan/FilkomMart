//NAMA : Muhammad Akmal Wildannov
//NIM : 255150400111009

package com.mb1.praktikum4;

import java.util.Scanner;

public class praktikum4_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        boolean status = true;

        int[] data = null;
        
        while (status == true){
        System.out.println("1. Input Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Average");
        System.out.println("4. Sum");
        System.out.println("5. Max");
        System.out.println("6. Min");
        System.out.println("7. Keluar");

        System.out.print("Masukkan menu: ");
        int input = scan.nextInt();

        switch (input) {
            case 1 :
                System.out.print("Masukkan range array: ");
                int n = scan.nextInt();

                data = new int[n];

                System.out.println("==========");
                for (int i = 0; i < n; i++){
                    System.out.print("Masukkan nilai ke-" + (i+1) + " : ");
                    data[i] = scan.nextInt();
                }
                System.out.println("==========");
                break;
            case 2 :
                System.out.println("==========");
                for (int i = 0; i < data.length; i++){
                    System.out.println("Data ke-" + (i+1) + " : " + data[i]);
                }
                System.out.println("==========");
                break;
            case 3 :
                int total = 0; 
                for (int i = 0; i < data.length; i++){
                    total += data[i];
                }

                int avg = total / data.length;
                System.out.println("==========");
                System.out.println("Average : " + avg);
                System.out.println("==========");
                break;
            case 4 :
                int sum = 0;
                for (int i = 0; i < data.length; i++){
                    sum += data[i];
                }
                System.out.println("==========");
                System.out.println("Sum : " + sum);
                System.out.println("==========");
                break;
            case 5 :
                int max = data[0];
                for (int i = 0; i < data.length; i++){
                    if (max < data[i]){
                        max = data[i];
                    }
                }
                System.out.println("==========");
                System.out.println("Max : " + max);
                System.out.println("==========");
                break;
            case 6 :
                int min = data[0];
                for (int i = 0; i < data.length; i++){
                    if (min > data[i]){
                        min = data[i];
                    }
                }
                System.out.println("==========");
                System.out.println("Min : " + min);
                System.out.println("==========");
                break;
            case 7 :
                status = false;
                break;
            default:
                throw new AssertionError();
        }
        

        }


    }
}
