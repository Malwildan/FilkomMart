package com.mb1.praktikum3;

import java.util.Scanner;

public class praktikum3_1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            for(int j = n - 1; j >= i; j--){
                System.out.print("  ");
            }
            
            for(int f = 0; f < i; f++){
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }
}
