package com.mb1.praktikum3;

public class praktikum3_2 {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++){
            for(int j = 0; j <= 14; j++){
                if(j == 7 - i){
                    System.out.print("A");
                }
                else if (j == 7 + i){
                    System.out.print("A");
                }
                else if(i == 4 && j > 7 - 4 && j < 7 + 4){
                    if(j%2==0){
                        System.out.print(" ");
                    } else if (j%2!=0){
                        System.out.print("A");
                    }
                }
                else{            
                System.out.print(" ");
                }
            }
            for (int k=0;k<=21;k++){
                
                if (k == i){
                    System.out.print("W");
                }
                else if (k+i == 12 && i>2 && i != 6){
                    System.out.print("W");
                }else if (k == 20-i) {
                    System.out.print("W");
                } else if (k-i==8 && i>=2 && i!=6){
                    System.out.print("W"); 
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
