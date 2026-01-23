package Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();
        Stack<String> str = new Stack<>();
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(postFix(s));
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
    public static String postFix( String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
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
}
