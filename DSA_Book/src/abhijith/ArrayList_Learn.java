package abhijith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Learn {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        int n =5;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            integers.add(sc.nextInt());
        }
        System.out.println(integers);
        System.out.println(integers.get(2));
        Collections.sort(integers);
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i)+" ");

        }
        System.out.println();
        for (int Lis :
                integers) {
            System.out.println(Lis+" ");
        }
    }
}
