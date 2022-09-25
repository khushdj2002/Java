public class heighest_water {
    public static void main(String[] args) {
      //  System.out.println("hii");
        heighest_water h1= new heighest_water();

        int arr[] = {1,2,4,3};
        System.out.println(h1.maxArea(arr));
    }
    public  int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            if((height[i]>=height[j])){
                if(height[j]*(j-i)>max) {
                    max = height[j] * (j - i);
                }
                System.out.println("hii "+max);
                j--;
            }
            else if((height[j]>height[i])){
                if (height[i]*(j-i)>max) {
                    max = height[i] * j - i;
                }
                System.out.println(max);
                System.out.println(i+" "+j);
                i++;
            }
        }
        return max;
    }
}
