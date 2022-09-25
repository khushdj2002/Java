public class Sum3_Closet {
    public int threeSumClosest(int[] nums, int target) {
        int min=nums[0]+nums[1]+nums[2];
        int t1 = Math.abs(target-(nums[0]+nums[1]+nums[2]));
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){

                    int a =Math.abs(target-(nums[i]+nums[j]+nums[k]));
                 //   System.out.println(a);
                    if(a<t1){
                        min=nums[i]+nums[j]+nums[k];
                        t1=Math.abs(target-(nums[i]+nums[j]+nums[k]));
                      //  System.out.println(min);
                    }
                }
            }
        }
        return min;
    }
}
