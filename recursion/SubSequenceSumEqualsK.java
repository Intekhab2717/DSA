package recursion;

import java.util.ArrayList;

public class SubSequenceSumEqualsK {
    public static void main(String[] args) {
        int[] a={1,2,1};
        int n=3;
        int sum=2;
        ArrayList<Integer> list =new ArrayList<>();
        fun(0,a,n,list,0,sum);
    }

    private static void fun(int i, int[] a, int n, ArrayList<Integer> list,int sum, int givenSum) {
        if(i>=n){
            if(sum==givenSum){
                System.out.println(list);
            }
            return;
        }
        list.add(a[i]);
        sum+=a[i];
        fun(i+1,a,n,list,sum,givenSum);
        list.remove(list.size()-1);
        sum-=a[i];
        fun(i+1,a,n,list,sum,givenSum);
    }
}
