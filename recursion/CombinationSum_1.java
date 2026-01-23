package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_1 {
    public static void main(String[] args) {
        int[] a={2,3,5,7};
        int target =8;
        ArrayList<List<Integer>> list = findComb(a,target);
        System.out.println(list);
    }

    private static ArrayList<List<Integer>> findComb(int[] a, int target) {
        ArrayList<List<Integer>> list =new ArrayList<List<Integer>>();
        findCombSum(0,target,a,list,new ArrayList<Integer>());
        return list;
    }

    private static void findCombSum(int i, int target, int[] a, ArrayList<List<Integer>> list, ArrayList<Integer> ds) {
        if(i==a.length){
            if(target==0){
                System.out.println(ds);
                list.add(new ArrayList<Integer>(ds));
            }
            return;
        }
        if(a[i]<=target) {
            ds.add(a[i]);
            findCombSum(i, target - a[i], a, list,ds);
            ds.remove(ds.size()-1);
        }
        findCombSum(i+1, target, a, list,ds);
    }
}
