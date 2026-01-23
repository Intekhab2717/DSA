package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_2 {
    public static void main(String[] args) {
        int[] a={1,1,1,1,2,2};
        Arrays.sort(a);
        int target =4;
        ArrayList<List<Integer>> list = findComb(a,target);
        System.out.println(list);
    }

    private static ArrayList<List<Integer>> findComb(int[] a, int target) {
        ArrayList<List<Integer>> list =new ArrayList<List<Integer>>();
        findCombSum(0,target,a,list,new ArrayList<>());
        return list;
    }

    private static void findCombSum(int i, int target, int[] a, ArrayList<List<Integer>> list, ArrayList<Integer> ds) {
            if(target==0){
                System.out.println(ds);
                list.add(new ArrayList<Integer>(ds));
                return;
            }
        for(int ind=i;ind<a.length;ind++) {
            if ( ind >i &&  a[ind] ==a[ind-1])
                  continue;
            if (a[ind] > target)
                 break;

                ds.add(a[ind]);
                findCombSum(ind+1, target - a[ind], a, list, ds);
                ds.remove(ds.size() - 1);
        }

    }
}
