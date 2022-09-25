public class BinarySearch {
    public static int BinaSea(int arr[],int low,int high,int key){
        if (high<low){
            return low-1;
        }
        int mid=low+(high-low)/2;
        // int mid = (low+high)/2;
        if (key==arr[mid]){
            return mid;
        } else if (key < arr[mid]) {
            return BinaSea(arr,low,mid-1,key);
        }
        else
            return BinaSea(arr, mid+1, high, key);

    }
}
