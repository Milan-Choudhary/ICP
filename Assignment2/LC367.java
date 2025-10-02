package Assignment2;

public class LC367 {
    
}
class Solution {
    public boolean isPerfectSquare(int num) {
        // Binary Search to find if num is a perfect square
        if(num == 1){
            return true;
        }
        
      int left = 2;
      int right = num;

      while(left <= right){
        int mid = left + (right - left)/2;
        long root = (long)mid*mid; 

        if(root == num){
            return true;
        }

        else if(root < num){
            left = mid + 1;
        }
        else{
            right = mid - 1;
        }
      }

    return false;
    }
}