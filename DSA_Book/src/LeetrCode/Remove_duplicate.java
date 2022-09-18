package LeetrCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(arr[i]);
        for (int j=i+1;j< arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];

                integers.add(arr[i]);
            }
        }
        System.out.println(integers);
    }
}
