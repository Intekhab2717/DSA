package Stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class ArithematicEvaluation {
    public static void main(String[] args) {
        String art = "((1+2)*(6-2))";
        //String art = "(2+4)*(4+6)";
        System.out.println("value: "+arithematicEval(art));
    }

    private static int arithematicEval(String art) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : art.toCharArray()) {
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
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
        //return sb.toString();
        //System.out.println(sb.toString());
        return evaluation(sb.toString());
    }
    public static int evaluation(String s) {
        Stack<Integer> st =new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            char c=s.charAt(i);
            if(isOpr(c)) {
                int val1=st.peek();
                st.pop();
                //int a = Integer.parseInt(op1);
                int val2=st.peek();
                st.pop();
                //int b = Integer.parseInt(op2);
                switch (c) {
                    case '+':
                        st.push(val2 + val1);
                        break;
                    case '-':
                        st.push(val2 - val1);
                        break;
                    case '*':
                        st.push(val2 * val1);
                        break;
                    case '/':
                        st.push(val2 / val1);
                        break;
                    case '^':
                        st.push(val2 ^ val1);
                        break;
                }
//                String temp=op2+c+op1;
//                st.push(temp);
            } else {
                int a = c-'0';
                st.push(a);
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
    public static int opr(char c) {
        if (c=='^')
            return 3;
        if ((c=='*') || (c=='/'))
            return 2;
        if ((c=='+') || (c=='-'))
            return 1;
        else
            return -1;
    }
}
