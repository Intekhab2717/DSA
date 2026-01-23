package hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Striver3sumEquaLTarget {
    public static void main(String[] args) {
        int[] arr={0, -1, 2, -3, 1,-3,0,-1,1,2};
        int target=-2;
        Arrays.sort(arr);
        int k= arr.length-1,j=0;
        HashSet<List<Integer>> set =new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1])
                continue;
            j=i+1;
            k= arr.length-1;
            while (j<k){
                int val=arr[i]+arr[j]+arr[k];
                if(val>target){
                    k--;
                } else if(val<target){
                    j++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    set.add(list);
                    j++;
                    k--;
                    while (j<k && arr[j] == arr[j - 1])
                        j++;
                    while (j<k && arr[k] == arr[k + 1])
                        k--;
                }
            }
        }
        System.out.println(set);
    }
}
