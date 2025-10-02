package Assignment4;

public class LC1004 {
    class Solution {
    public int longestOnes(int[] nums, int k) {
        // Sliding window to find the longest subarray with at most k ones
        int start = 0;
        int count = 0;
        int maxlen = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                count += 1;
            }

            while(count > k){
                if(nums[start] == 0){
                    count -= 1;
                }
                start += 1;
            }

            maxlen = Math.max(maxlen,i - start + 1);
        }
            
        return maxlen;
    }
}
}
