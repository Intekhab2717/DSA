package recursion;

import java.util.ArrayList;

public class CountSubSequenceOnlyOneSumEqualsK {
    public static void main(String[] args) {
        int[] a={1,2,1};
        int n=3;
        int sum=2;
        int count = fun(0,a,n,0,sum);
        System.out.println(count);
    }

    private static int fun(int i, int[] a, int n,int sum, int givenSum) {
        if(i>=n){
            if(sum==givenSum){
                return 1;
            }
            else
                return 0;
        }
        sum+=a[i];
        int l=fun(i+1,a,n,sum,givenSum);
        sum-=a[i];
        int r=fun(i+1,a,n,sum,givenSum);
        return l+r;
    }
}
