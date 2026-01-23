package Stack;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Infix : " + convert(exp));
    }
    public static String convert(String str) {
        Stack<String> st =new Stack<>();
        for (int i = str.length()-1; i >=0 ; i--) {
            char c=str.charAt(i);
            if(isOpr(c)){
                String op1=st.pop();
                String op2=st.pop();
                String temp="("+op1+c+op2+")";
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
