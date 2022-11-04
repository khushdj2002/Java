import java.util.Scanner;

public class Paypal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[] =new int[m] ;
        for (int i = 0; i < m; i++) {
            arr[i]= sc.nextInt();
        }
        int n= sc.nextInt();
        int index=-1;
        int a=0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                index = i;
            break;
            }
        }
        for (int i =index; i >= 0; i--) {
            if(i==0){
                arr[i]=1;
            }
            else {
                arr[i] = arr[i - 1];
            }
        }
            for (int i = 1; i < arr.length; i++) {
                if(n>0) {
                    a = arr[i];
                n--;
                }
                else {
                    System.out.println(a);
                    break;
                }
                if(i== arr.length-1){
                    i=-1;
                }
            }
    }
}
