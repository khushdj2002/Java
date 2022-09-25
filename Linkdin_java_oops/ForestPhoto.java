import java.util.Scanner;

public class ForestPhoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a];
        int max=0;

        for (int i = 0; i < a; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < arr.length - b+1; i++) {
            int c=0;
            for (int j = i; j < i+b ; j++) {
                c=c+arr[j];
            }
            if(c>max){
                max=c;
            }
        }
        System.out.println(max);
    }
}
