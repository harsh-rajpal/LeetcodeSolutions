package 198. House Robber;

public class Solution{
    public int rob(int[] nums) {
        int eve_Sum=0;
        int odd_Sum=0;
        int a=0,b=0;
        if(nums.length>0){
        for( a=0;a<nums.length;a++){
            if (a % 2 == 0)
                eve_Sum+=nums[a];
            else
                odd_Sum += nums[a];
        }
        if(eve_Sum>odd_Sum){
            return eve_Sum;
        }
        else{
            return odd_Sum;
            }
        }
        else{
            return 0;
        }
    }
}
//Partially correct, Will fail in edge case.
