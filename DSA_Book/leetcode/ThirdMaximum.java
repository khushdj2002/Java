import java.util.ArrayList;
import java.util.Arrays;

public class ThirdMaximum {

        public int thirdMax(int[] nums) {
            ArrayList<Integer> arr1 = new ArrayList<>();
            int i=1;
           // int arr[]=new int[nums.length];
           // arr[0]=nums[0];
            arr1.add(nums[0]);
            for(int j=1;j<nums.length;j++){
                if(nums[j-1]!=nums[j]){
                  //  arr[i]=nums[j];
                    arr1.add(nums[j]);

                   // i++;
                }

            }
            //Arrays.sort(arr);
           // System.out.print(Arrays.toString(arr));
            if(arr1.size()<3)
                return arr1.get(arr1.size());

            return arr1.get(arr1.size()-3);
        }

}
