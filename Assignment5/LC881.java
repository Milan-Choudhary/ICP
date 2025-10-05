package Assignment5;

import java.util.Arrays;

public class LC881 {
    class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Boat people with two-pointer technique

        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int c = 0;

        while(left <= right){
            if(people[right] + people[left] <= limit){
                left += 1;
            }
            c += 1;
            right -= 1;
            
        }
       
       return c;

       
    }
 }
}
