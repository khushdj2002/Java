import java.util.Scanner;

public class Multitask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        String c = Integer.toString(a);
        char m;
        StringBuilder input1 = new StringBuilder();
        input1.append(c);
        input1.reverse();
        String z="";
        switch (b){
            case 'A':
                z=z+c.charAt(0)+c.charAt(c.length()-1);
                System.out.println(z);
                break;
            case 'B':
                if(c.equals(input1)){
                    System.out.println("Its a palindrome");
                }
                else
                    System.out.println("Its not a palinf=de=rome");
                break;
            case 'C':
                System.out.println(c.length());
                break;
            case 'D':
                for (int i = 0; i < c.length(); i++) {
                     m = c.charAt(i);

                     switch (m){
                         case '0':
                             System.out.print("Zero ");
                             break;
                         case '1':
                             System.out.print("One ");
                             break;
                         case '2':
                             System.out.print("Two ");
                             break;
                         case '3':
                             System.out.print("Three ");
                             break;
                         case '4':
                             System.out.print("Four ");
                             break;
                         case '5':
                             System.out.print("Five ");
                             break;
                         case '6':
                             System.out.print("Six ");
                             break;
                         case '7':
                             System.out.print("Seven ");
                             break;
                         case '8':
                             System.out.print("Eight ");
                             break;
                         case '9':
                             System.out.print("Nine ");
                             break;

                     }
                }

        }
    }
}
