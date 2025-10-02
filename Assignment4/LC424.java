package Assignment4;

public class LC424 {
    class Solution {
    public int characterReplacement(String s, int k) {
        // Sliding window to find the longest substring with at most k replacements
        int[] freq = new int[26];
        int start = 0;
        int maxFreq = 0; 
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            freq[s.charAt(end) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(end) - 'A']);

            while ((end - start + 1) - maxFreq > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
 }
}
