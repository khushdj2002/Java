import java.util.ArrayList;
import java.util.Scanner;

public class Paypal_inter {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                ArrayList<Integer> arra = new ArrayList<>();
                int m = sc.nextInt();
                for (int i = 0; i < m; i++) {
                    arra.add(sc.nextInt());
                }
                int n= sc.nextInt();
                int index=-1;
                int a=0;


            if(arra.contains(1)) {
                index = arra.indexOf(1);
                Integer[] obj = new Integer[arra.size()];
                obj = arra.toArray(obj);
                int z=1;
                    while(n>0) {
                            a = obj[z-1];
                            n--;
                            z=obj[z-1];
                        }
                System.out.println(a);
                    }


            else {
                arra.add(1);
                Integer[] obj = new Integer[arra.size()];
                obj = arra.toArray(obj);
                int z=1;
                while(n>0) {
                    a = obj[z-1];
                    n--;
                    z=obj[z-1];
                    System.out.println(obj[z-1]);
                }
                System.out.println(a);
            }
            }
        }


