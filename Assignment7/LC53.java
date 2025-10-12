package Assignment7;

public class LC53 {
    class Solution {
    public int maxSubArray(int[] nums) {
       int sum = nums[0];
       int maxsum = nums[0];
       int i = 1;

       while(i < nums.length){

            sum = Math.max(nums[i],sum + nums[i]);
            maxsum = Math.max(maxsum,sum);

             i += 1;
       } 

       return maxsum;
    }
}
}
