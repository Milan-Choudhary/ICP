package Assignment4;

import java.util.HashSet;
import java.util.Set;

public class LC3 {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Sliding window to find length of longest substring without repeating characters
      Set<Character> set = new HashSet<>();

      int start = 0;
      int end = 0;
      int maxlen = 0;

      while(end < s.length()){
        char ele = s.charAt(end);

        while(set.contains(ele)){
            set.remove(s.charAt(start));
            start += 1;
        }

        set.add(ele);
        maxlen = Math.max(maxlen,end - start + 1);
        end += 1;
      }

      return maxlen;

    }
}
}
