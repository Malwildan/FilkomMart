package com.mb1.pemdas;

import java.util.Scanner;

public class studikasus_3b {
    public static void main (String[] Args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan baris/kolom array: ");
        int bariskolom = scan.nextInt();

        int[][] a = new int[bariskolom][bariskolom];    

        for (int i = 0; i < bariskolom; i++){
            for (int j = 0; j < bariskolom; j++){
            System.out.print("Masukkan isi arrray A baris ke-"+i+" kolom ke-"+j+": ");
            a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < bariskolom; i++){
            for (int j = 0; j < bariskolom; j++){
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Hasil transpose matriks:");
        for (int i = 0; i < bariskolom; i++) {
            for (int j = 0; j < bariskolom; j++) {
            System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

    }
}
