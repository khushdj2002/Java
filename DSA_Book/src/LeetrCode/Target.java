package LeetrCode;

import java.util.Scanner;

public class Target {
    Scanner sc = new Scanner(System.in);
    public int [] find(int nums[],int n){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(n==nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
       return null;
    }

    public static void main(String[] args) {
        Target t = new Target();
        int n[] = {4,8,9,1,7};
        System.out.println(t.find(n,5));

    }
}
