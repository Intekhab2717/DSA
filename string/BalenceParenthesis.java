package string;

import java.util.Stack;

public class BalenceParenthesis {
    public static void main(String[] args) {
        String s="][";
        boolean b= isBalanced(s);
        System.out.println(b);
    }
    static boolean isBalanced(String s) {
        Stack<Character> st =new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                     return false;
                }
                char out = st.pop();
                if((c==')' && out!='(') || (c=='}' && out!='{') || (c==']' && out!='[')) {
                   return false;
               }
            }
        }
        return st.isEmpty();
    }
}
