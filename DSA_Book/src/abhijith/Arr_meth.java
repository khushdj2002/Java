package abhijith;

import java.util.Scanner;

public class Arr_meth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arr a1 = new Arr();
        a1.minimax(new int[]{sc.nextInt()});
    }
}



class Arr{

    public void minimax(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}

