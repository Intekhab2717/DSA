package Stack;

import java.util.Queue;
import java.util.Stack;

public class FirstProg {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        int flag =0;
     //   Queue<Integer> qt = new Queue<Integer>();
        for (int i = 1; i < 11; i++) {
            st.push(i);
        }

        while (!st.isEmpty()) {
            st1.push(st.peek());
            //st.pop();
            System.out.print(st.pop()+" ");
        }
        System.out.println("-----------size----------"+st1.size());
        while (!st1.isEmpty()) {
            System.out.print(st1.peek()
                    + " ");
            st1.pop();
        }
        String s="()[{(}()]";
        Stack<Character> blance = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                blance.push(s.charAt(i));
            } else if (!blance.empty() &&
                    ((blance.peek() == '(' && s.charAt(i) == ')') ||
                            (blance.peek() == '{' && s.charAt(i) == '}') ||
                            (blance.peek() == '[' && s.charAt(i) == ']'))) {
                blance.pop();
            }
            else {
                // Unmatched closing bracket
                System.out.println("not balanced");
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println("balanced");
        }
    }
}
