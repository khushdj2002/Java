import java.util.Arrays;

public class Median_of_two_Array {
    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        int arra[] = new int[nums1.length+ nums2.length];
        System.arraycopy(nums1,0,arra,0,nums1.length);
        System.arraycopy(nums2,0,arra,nums1.length,nums2.length);
        System.out.println(arra.length);
        Arrays.sort(arra);
        if(arra.length%2==0){
            double a = arra[arra.length/2];
            double b = arra[(arra.length-1)/2];
            return (a+b)/2;

        }
        else
            return arra[(arra.length)/2];

    }
}
