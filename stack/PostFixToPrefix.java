package Stack;

import java.util.Stack;

public class PostFixToPrefix {
    public static void main(String[] args) {
        String post_exp = "ABC/-AK/L-*";

        // Function call
        System.out.println("Prefix : "
                + postToPre(post_exp));
    }
    public static String postToPre(String str) {
        Stack<String> st =new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            char c=str.charAt(i);
            if(isOpr(c)){
                String op1=st.pop();
                String op2=st.pop();
                String temp=c+op2+op1;
                st.push(temp);
            } else {
                st.push(c+"");
            }
        }
        return st.pop();
    }

    public static boolean isOpr(char c) {
        return switch (c) {
            case '^', '*', '/', '+', '-' -> true;
            default -> false;
        };
    }
}
