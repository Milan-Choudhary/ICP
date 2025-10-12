package Assignment8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LC150 {
    class Solution {
        // Evaluate the value of an arithmetic expression in Reverse Polish Notation
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

       Set<String> set = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

        for(int i = 0; i<tokens.length; i++){
            if(set.contains(tokens[i])){
                int second = st.pop();
                int first = st.pop();
                if(tokens[i].equals("+")){
                    st.push(first+second);
                }
                else if(tokens[i].equals("*")){
                    st.push(first*second);
                }
                else if(tokens[i].equals("-")){
                    st.push(first-second);
                }
                else{
                    st.push(first/second);
                }
            }

            else{
                int ele = Integer.parseInt(tokens[i]);
                st.push(ele);
            }
            
        }

        return st.pop();
    }

}
}
