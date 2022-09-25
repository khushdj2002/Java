import java.util.Arrays;

public class MergeArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int arr[] = new int[m+n];

            System.arraycopy(nums1,0,arr,0,m);
            System.arraycopy(nums2,0,arr,m,n);
            Arrays.sort(arr);
            //System.out.print(Arrays.toString(arr));
            System.out.print("[");
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]);
                if(i==m+n-1){
                    break;
                }
                System.out.print(",");
            }
            System.out.print("]");
        }
}
