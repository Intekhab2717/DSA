package Stack;

public class StackUsingArray {
    public static void main(String[] args) {
        MyStack st = new MyStack(10);
        for (int i = 1; i < 11; i++) {
            st.push(i);
        }
        System.out.println("peek is :"+st.peek());
        while (!st.isEmpty()){
            System.out.println("pop hai :"+st.peek());
            st.pop();
        }
        System.out.println();
    }
}
