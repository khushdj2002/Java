import java.util.Arrays;

class Solution2 {
        public int maxArea(int[] height) {
            int a=0;
            int [] arr = new int[height.length* height.length];
            for(int i=0;i<height.length;i++){
                for(int j=height.length-1;j>i;j--){
                    if(height[i]>height[j])
                        arr[a]=height[j]*height[j];
                    else
                        arr[a]=height[i]*height[i];
                    a++;
                }
            }
            Arrays.sort(arr);
            return arr[arr.length-1];
        }
}
