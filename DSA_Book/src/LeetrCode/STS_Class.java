package LeetrCode;

import java.util.Scanner;

public class STS_Class {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

//        for (int i = 0; i < 3 ; i++) {
//            for (int j = i+1; j > 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 3; i > 0 ; i--) {
//            for (int j = i; j > 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==0||i==9||j==0||j==9||i==j){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}