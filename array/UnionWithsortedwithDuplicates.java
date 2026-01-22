package mycode;

import java.util.LinkedList;
import java.util.List;

public class UnionWithsortedwithDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        int[] arr = {2, 3, 4, 4, 5, 6};
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        for (int n : arr)
             list.add(n);

        for (int n1 : arr1)
            list.add(n1);
        System.out.println(list);
    }
}
