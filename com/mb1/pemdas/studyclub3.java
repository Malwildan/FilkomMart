package com.mb1.pemdas;

import java.util.Random;
import java.util.Scanner;

public class studyclub3 {
    public static void main(String[] args) {

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        int panjang = generator.nextInt(1 , 100);
        System.out.println("Panjang: " + panjang);

        int lebar = generator.nextInt(1, 100);
        System.out.println("Lebar: " + lebar);

        int luas = panjang * lebar;

        boolean status = true;
        int salah = 0;

        while (status){
            System.out.print("Berapakah luasnya?: ");
            int jawaban = scan.nextInt();

            if (jawaban == luas) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + luas);
                salah += 1;
            }

            if (salah == 5) {
                System.out.println("Anda telah salah 5 kali. Program akan berhenti.");
                status = false;
            } else {
                System.out.println("Anda telah menjawab salah " + salah + " kali.");
            }
        }
    }
}
