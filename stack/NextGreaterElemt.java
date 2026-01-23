package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class  NextGreaterElemt {
    public static void main(String[] args) {
        int[] arr ={2,10,12,1,11};
        int[] nge = nge(arr);
        System.out.println(Arrays.toString(nge));
    }

    private static int[] nge(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] arr1 = new int[n];
        for (int i = (2*n-1); i >= 0 ; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i%n]) {
                st.pop();
            }
            if (i<n) {
                arr1[i] = st.isEmpty()?-1:st.peek();
            }
            st.push(arr[i%n]);
        }
        return arr1;
    }
}
