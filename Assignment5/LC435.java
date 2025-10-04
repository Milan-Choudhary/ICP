package Assignment5;

import java.util.Arrays;

public class LC435 {
    class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Greedy algorithm to find minimum number of intervals to remove to eliminate all overlaps
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int countNonOverlap = 1; 
        int end = intervals[0][1]; 

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                countNonOverlap++;
                end = intervals[i][1];
            }
        }

        return intervals.length - countNonOverlap;
    }
 }
}
