package com.mb1.pemdas;

import java.util.Random;
import java.util.Scanner;

public class studyclub2 {
    public static void main(String[] args) {

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        int panjang = generator.nextInt(1 , 100);
        System.out.println("Panjang: " + panjang);

        int lebar = generator.nextInt(1, 100);
        System.out.println("Lebar: " + lebar);

        int luas = panjang * lebar;
        System.out.print("Berapakah luasnya?: ");
        int jawaban = scan.nextInt();

        if (jawaban == luas) {
            System.out.println("Jawaban Anda benar!");
        } else {
            System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + luas);
        }
    }
}
