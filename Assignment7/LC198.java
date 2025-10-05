package Assignment7;

public class LC198 {
    class Solution {
        // Dynamic Programming to find the maximum amount that can be robbed
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        int prev1 = Math.max(nums[0],nums[1]);
        int prev2 = nums[0];

        for(int i = 2; i<nums.length; i++){
            int curr = Math.max(nums[i] + prev2,prev1);

            prev2 = prev1;
            prev1 = curr;
            
        }

        return prev1;
    }
}
}
