package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SubSetSum_2 {
    public static void main(String[] args) {
        int[] a={1,2,2};
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> list =findSubSetSum(a);
        System.out.println(list);
        System.out.println(list.size());
    }

    private static ArrayList<ArrayList<Integer>> findSubSetSum(int[] a) {
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        findSubSet(0,a,list,new ArrayList<Integer>());
        return list;
    }

    private static void findSubSet(int i, int[] a, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ds) {
        list.add(new ArrayList<>(ds));
        for (int ind = i; ind < a.length; ind++) {
            if (ind!=i && a[ind] == a[ind-1])
                continue;

            //sum += a[i];
            ds.add(a[ind]);
            findSubSet(ind + 1,a, list, ds);
            //sum -= a[i];
            ds.remove(ds.size() - 1);
        }

    }
}
