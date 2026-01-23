package Stack;

import java.util.Arrays;
import java.util.Stack;

public class PriviousSmallestElmt {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 6, 7,4,5,1,3,7};
        int[] pse = pse(arr);
        System.out.println(Arrays.toString(pse));
    }

    private static int[] pse(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] arr1 = new int[n];
        for (int i = 0; i <= n - 1; i++) {
                while (!st.isEmpty() && st.peek() >= arr[i]) {
                    st.pop();
                }
                arr1[i] = st.isEmpty() ? -1 : st.peek();
                st.push(arr[i]);
        }
        return arr1;
    }
}