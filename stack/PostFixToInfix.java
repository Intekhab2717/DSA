package Stack;

import java.util.Stack;

public class PostFixToInfix {
    public static void main(String[] args) {
        String exp = "ab*c+";
        System.out.println( getInfix(exp));
    }

    public static String getInfix(String str) {
        Stack<String> st =new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            char c=str.charAt(i);
            if(isOpr(c)){
                String op1=st.pop();
                String op2=st.pop();
                String temp="("+op2+c+op1+")";
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
