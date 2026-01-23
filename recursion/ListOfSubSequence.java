package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListOfSubSequence {
    public static void main(String[] args) {
        int[] a={1,2,2};
        int n=3;
        ArrayList<Integer> list =new ArrayList<>();
        Set<ArrayList<Integer>> list1 =new LinkedHashSet<ArrayList<Integer>>(); //it will handle duplicates
        fun(0,a,n,list,list1);
        System.out.println(list1);
    }

    private static void fun(int i, int[] a, int n, ArrayList<Integer> list, Set<ArrayList<Integer>> list1) {
        if(i>=n){
            System.out.println(list);
            list1.add(new ArrayList<>(list));
            return;
        }
        list.add(a[i]);
        fun(i+1,a,n,list,list1);
        list.remove(list.size()-1);
        fun(i+1,a,n,list,list1);
    }
}
