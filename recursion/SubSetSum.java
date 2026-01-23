package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSetSum {
    public static void main(String[] args) {
        //int[] a={2,3,4,5};
        int[] a={1,2,2,2,3,3};
        Arrays.sort(a);
        ArrayList<Integer> list =findSubSetSum(a);
        System.out.println(list);
        System.out.println(list.size());
    }

    private static ArrayList<Integer> findSubSetSum(int[] a) {
        ArrayList<Integer> list =new ArrayList<>();
        findSubSet(0,0,a,list,new ArrayList<Integer>());
        return list;
    }

    private static void findSubSet(int i, int sum, int[] a, ArrayList<Integer> list,ArrayList<Integer> ds) {
        if(i==a.length){
            list.add(sum);
            System.out.println(ds);
            return;
        }
        sum+=a[i];
        ds.add(a[i]);
        findSubSet(i+1,sum,a,list,ds);
        sum-=a[i];
        ds.remove(ds.size()-1);
        findSubSet(i+1,sum,a,list,ds);
    }
}
