import java.util.Scanner;

public class SwitchUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int a = sc.nextInt();

        switch (a){
            case 1:
                int min=Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    if(arr[i]<min){
                        min=arr[i];
                    }
                }
                System.out.println(min);
                break;
            case 2:
                int max=0;
                for (int i = 0; i < n; i++) {
                    if(arr[i]>max){
                        max=arr[i];
                    }
                }
                System.out.println(max);
                break;
            case 3:
                int sum=0;
                for (int i = 0; i < n; i++) {
                   sum+=arr[i];
                }
                System.out.println(sum);
                break;
            case 4:
                double avg;
                sum=0;
                for (int i = 0; i < n; i++) {
                    sum+=arr[i];
                }
                avg=sum/n;
                System.out.println(avg);
                break;
            default:
                System.out.println("Illegal Input");
        }

    }
}
