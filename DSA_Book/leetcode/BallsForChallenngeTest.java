import java.util.Scanner;

public class BallsForChallenngeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BallsForChallenge b1 = new BallsForChallenge(sc.next(), sc.next());
        String a="";
        for (int i = 0; i < b1.s1.length(); i++) {
            if((b1.s1.charAt(i)=='W')&&(b1.s2.charAt(i)=='W')){
                a=a+'B';
            } else if ((b1.s1.charAt(i)=='B')&&(b1.s2.charAt(i)=='B')) {
                a=a+'W';
            }
            else {
                a=a+ b1.s1.charAt(i);
            }
        }
        System.out.println(a);
    }
}
