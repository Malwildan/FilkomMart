package com.mb1.pemdas;

import java.util.Scanner;

public class studikasus2b {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan N: ");
        int n = scan.nextInt();

        int count = 0;
        int number = 2;

        while (count < n){
            System.out.print(number+" ");
            number += 2;
            count++;
        }

        scan.close();

    }
}
