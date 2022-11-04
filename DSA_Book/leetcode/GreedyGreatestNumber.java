import java.util.ArrayList;
import java.util.Scanner;

public class GreedyGreatestNumber {
    public static int largest_num(ArrayList<Integer> arr){
        int max=arr.get(0),index=0;
        for(int i=0;i<arr.size();i++){
            if(max<arr.get(i)){
                max=arr.get(i);
                index=i;
            }
        }

        return index;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> out = new ArrayList<Integer>();
        for(int i = 0; i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        for(int i = 0;i<n;i++)
        {
            int index = largest_num(arr);
            out.add(arr.get(index));
            arr.remove(index);

        }
        System.out.println("The largest number formed from array is : ");
        for(int i = 0;i<out.size();i++)
            System.out.print(out.get(i));
    }
}
