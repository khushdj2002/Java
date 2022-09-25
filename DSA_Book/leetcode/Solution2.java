import java.util.Arrays;

class Solution2 {

    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            if((height[i]>=height[j])&&(height[j]*(j-i)>max)){
                max=height[j]*(j-i);
                j--;
            }
            if((height[j]>height[i])&&(height[i]*(j-i)>max)){
                max=height[i]*j-i;
                i++;
            }
        }
        return max;
    }
}
