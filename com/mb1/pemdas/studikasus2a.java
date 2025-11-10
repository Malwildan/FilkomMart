package com.mb1.pemdas;

import java.util.Scanner;

public class studikasus2a {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int total = scan.nextInt();

        int i = total; 
        int j = 1;     

        while (i > 0) {
            System.out.print(j);

            if (j == i) { 
                System.out.println();
                i--;    
                j = 1;  
            } else {
                j++;    
            }
        }

        scan.close();
    }
}
