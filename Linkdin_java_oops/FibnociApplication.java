import java.util.Scanner;

public class FibnociApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int n1=0,n2=1,n3,i,count=input.length();
        Fibnocii fa = new Fibnocii();
        System.out.print(fa.Fib(count));

        for (int j = 0; j < count; j++) {
            n3=n1+n2;
            char c =input.charAt(j);
            System.out.print(c);
            System.out.print(n3);
            n1=n2;
            n2=n3;
        }
    }
}
