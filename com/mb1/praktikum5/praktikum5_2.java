package com.mb1.praktikum5;

import java.util.Scanner;

public class praktikum5_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        if (isPrima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }

    public static boolean isPrima(int bilangan) {
        if (bilangan < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(bilangan); i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }

        return true;
    }
    
}
