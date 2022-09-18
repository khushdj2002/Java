package LeetrCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Median_of_two {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array 1");
        int m = sc.nextInt();
        System.out.println("Enter size of arrat 2");
        int n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i =0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i =0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[] = new int[n+m];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);

        Arrays.sort(arr3);
        System.out.println(arr3[arr3.length/2]);
    }
}

