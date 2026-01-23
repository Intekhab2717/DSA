package Ques;

import java.util.Stack;

public class QueUsingStack {
    static Stack<Integer> st =new Stack<>();

    public static void main(String[] args) {
        pusss(10);
        pusss(11);
        System.out.println("Topped elmt : "+ topper());
        System.out.println("Popped elmt : "+popped());
        System.out.println("Topped elmt : "+ topper());
        pusss(10);
        System.out.println("Popped elmt : "+popped());
        System.out.println("Topped elmt : "+ topper());
        pusss(11);
        System.out.println("Topped elmt : "+ topper());
    }

    private static int topper() {
        return st.peek();
    }

    private static int popped() {
        return st.pop();
    }

    private static void pusss(int i) {
        st.push(i);
        System.out.println("Elmt pusshed :"+ i);
        for (int j = 0; j < st.size()-1; j++) {
            st.push(st.peek());
            st.pop();
        }
    }
}
