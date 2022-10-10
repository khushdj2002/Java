import java.util.*;
public class LinearSearch {
    static int recursive(int arr[], int low, int high, int key){
        if (high<low)
            return -1;
        if (arr[high]==key)
            return high;
        if (arr[low]==key)
            return low;
        return recursive(arr, low+1,high-1,key);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int arr[]=new int[] {3,4,6,56,3,9};
        int index=recursive(arr,0,arr.length-1, key);
        if (index!=-1)
            System.out.println("Element " + key +" is in index "+ index);
        else
            System.out.println("Not Present");
    }

}