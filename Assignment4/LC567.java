package Assignment4;

import java.util.HashMap;

public class LC567 {
    class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Sliding window to check if s2 contains any permutation of s1
        if(s1.length() > s2.length()){
            return false;
        }
        HashMap<Character,Integer> required = new HashMap<>();
        HashMap<Character,Integer> map = new HashMap<>();

        int k = s1.length();

        for(int i = 0; i<s1.length(); i++){
            char ele = s1.charAt(i);
            required.put(ele,required.getOrDefault(ele,0)+1);
        }

        for(int i = 0; i<k; i++){
            char ele = s2.charAt(i);
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        if(map.equals(required)){
            return true;
        }

        for(int i = k; i<s2.length(); i++){
            char ele1 = s2.charAt(i);
            char ele2 = s2.charAt(i - k);

            map.put(ele2,map.get(ele2) - 1);
            if(map.get(ele2) == 0){
                map.remove(ele2);
            }

            map.put(ele1,map.getOrDefault(ele1,0)+1);

            if(map.equals(required)){
                return true;
            }
        }

        return false;
        
    }
}
}
