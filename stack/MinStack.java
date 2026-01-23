package Stack;

import java.util.Stack;

public class MinStack {
    static int min= Integer.MAX_VALUE;
    static Stack<Integer> st = new Stack<>();
    public static void main(String[] args) {
        //Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        st.push(12);
        st.push(15);
        st.push(10);
        System.out.println(getMin());
        st.push(16);
        System.out.println(top());
        System.out.println(getMin());

    }
    public static void push(int val) {
            if (st.isEmpty()) {
                min = val;
                st.push(val);
            } else if (val > min) {
                st.push(val);
            } else {
                st.push(2*val-min);
                min =val;
            }
        }

        public static void pop(){
            if (st.isEmpty()) {
                return;
            } else {
                int x = st.peek();
                st.pop();
                if (x < min) {
                    min = 2*min-x;
                }
            }
        }

        public static int top() {
            if (st.isEmpty()) {
                return 0;
            } else {
                int x =st.peek();
                if(min < x){
                    return x;
                } else {
                    return min;
                }
            }
        }

        public static int getMin(){
            return min;
        }

}
