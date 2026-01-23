package Stack;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "(a-b/c)*(a/k-l)";
        System.out.println(convertToPrefix(s));
    }

    private static String convertToPrefix(String infix) {
        StringBuilder sb= new StringBuilder(infix);
        sb.reverse();
        infix = sb.toString();
        char[] ch = infix.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='('){
                ch[i]=')';
            } else if (ch[i]==')') {
                ch[i]='(';
            }
        }
        String postfix = converPostFix(new String(ch));
        return new StringBuilder(postfix).reverse().toString();
    }

    private static String converPostFix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(c);
            } else if(c=='('){
                st.push(c);
            } else if(c==')'){
                while (!st.isEmpty() && st.peek() !='(') {
                    sb.append(st.pop());
                }
                st.pop();
            } else {
                while(!st.isEmpty() && opr(c) <= opr(st.peek())) {
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static boolean isOpr(char c) {
        return switch (c) {
            case '^', '*', '/', '+', '-' -> true;
            default -> false;
        };
    }

    public static int opr( char c){
        if(c=='^')
            return 3;
        else if((c=='*')||c=='/')
            return 2;
        else if((c=='+')||c=='-')
            return 1;
        else
            return 0;
    }
}
