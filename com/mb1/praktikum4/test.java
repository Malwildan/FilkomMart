package com.mb1.praktikum4;

public class test {
    public static void main(String[] args) {
        
        int k = 0;
for (int i = 0; i < 3; i++) {            // loop i dari 0 sampai 2
    for (int j = 0; j < 3; j++) {        // loop j dari 0 sampai 2
        if (i + j == 3) {                // kalau i+j == 3
            break;                       // keluar dari loop j
        }
        k++;                             // increment k
    }
    k++;                                 // increment k setiap selesai inner loop
}
System.out.println("k = " + k);

    }
}
