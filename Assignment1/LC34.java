class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Count first and last occurence of target in nums
        int[] num = new int[2];
        int first = -1;
        int last = -1;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                    last = mid;
                }
            
            if(nums[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }

        }

        left = 0;
        right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                    first = mid;
                }

            if(nums[mid] >= target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        

        num[0] = first;
        num[1] = last;

        return num;
    }
}
