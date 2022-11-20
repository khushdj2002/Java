import java.util.Scanner;

public class OptimalBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of components");
        int n = sc.nextInt();
        int arr_key[]= new int[n];
        int arr_freq[]= new int[n];
        for (int i = 0; i < arr_freq.length; i++) {
            arr_key[i]= sc.nextInt();
            arr_freq[i]= sc.nextInt();
        }
        int arr_tab[][]= new int[n+1][n+1];
        for (int i = 0; i < arr_tab.length; i++) {
            for (int j = i; j < arr_freq.length ; j++) {
                if(i==j){
                    arr_tab[i][j]=0;
                }
                else {

                }
            }
        }
    }
}
