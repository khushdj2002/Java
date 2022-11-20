import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        ReverseNumber rn = new ReverseNumber();
        System.out.println(rn.Reverse(sc.nextInt()));
    }
    public int Reverse(int n){
        int rev=0;
        for (int i = n; i >0 ; i=i/10) {
            rev=rev*10+(i%10);
        }
        return rev;
    }
}
