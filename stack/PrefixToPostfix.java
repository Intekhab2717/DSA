package Stack;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println("Postfix : "
                + preToPost(pre_exp));
    }
    public static String preToPost(String str) {
        Stack<String> st =new Stack<>();
        for (int i = str.length()-1; i >=0 ; i--) {
            char c=str.charAt(i);
            if(isOpr(c)){
                String op1=st.pop();
                String op2=st.pop();
                String temp=op1+op2+c;
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
