package com.mb1.pemdas;

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan range array: ");
        int range = scan.nextInt();

        int[] array = new int[range];

        System.out.println("Masukkan nilai kedalam array");
        for (int i = 0; i < range; i++){
            System.out.print("Nilai array ke-" + i + ": ");
            array[i] = scan.nextInt();
        }

        mengurutkan(array);

        System.out.println("Array setelah diurutkan");

        for (int i = 0; i < range; i++){
            System.out.println(array[i]);
        }
    }

    public static void mengurutkan(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}