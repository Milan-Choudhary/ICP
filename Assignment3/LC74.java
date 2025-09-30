package Assignment3;

public class LC74 {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(matrix[mid/n][mid%n] == target){
                return true;
            }

            else if(matrix[mid/n][mid%n] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        } 
        
        return false;
    }
}
}
