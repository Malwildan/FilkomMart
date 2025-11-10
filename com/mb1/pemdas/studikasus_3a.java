package com.mb1.pemdas;

import java.util.Scanner;

public class studikasus_3a {
    public static void main (String[] Args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan panjang array: ");
        int panjang = scan.nextInt();

        int[] a = new int[panjang];
        int[] b = new int[panjang];
        int[] total = new int[panjang];

        for (int i = 0; i < a.length; i++){
            System.out.print("Masukkan isi arrray a ke " + i + ": ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < b.length; i++){
            System.out.print("Masukkan isi arrray b ke " + i + ": ");
            b[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            total[i] = a[i] + b[i];
            System.out.println(total[i]);
        }
    }
}
