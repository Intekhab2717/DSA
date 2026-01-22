package mycode;

import java.util.HashSet;
import java.util.Set;

public class UnionUnsortedUniqEllement {
    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 4, 0, 1};
        int[] arr1 = {8, 1, 7, 3, 9, 5};
        Set<Integer> set =new HashSet<>();
        for (int n : arr)
            set.add(n);

        for (int n1 : arr1)
            set.add(n1);
        System.out.println(set);
    }
}
