package Assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC438 {
    class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // Sliding window to find all anagrams of p in s
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()){
            return res;
        }
        HashMap<Character,Integer> req = new HashMap<>();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ele : p.toCharArray()){
            req.put(ele,req.getOrDefault(ele,0)+1);
        }

        int k = p.length();

         for(int i = 0; i<k; i++){
            char ele = s.charAt(i);
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        if(map.equals(req)){
            res.add(0);
        }

        for(int i = k; i<s.length(); i++){
            char ele1 = s.charAt(i);
            char ele2 = s.charAt(i - k);

            map.put(ele2,map.get(ele2) - 1);
            if(map.get(ele2) == 0){
                map.remove(ele2);
            }

            map.put(ele1,map.getOrDefault(ele1,0)+1);

            if(map.equals(req)){
                res.add(i - k + 1);
            }
        }

        return res;

    }
}
}
