package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveMinElmtsSuchThatNoCommonElmtExistIntwoarr {
    public static void main(String[] args) {
        int[] arr = {4,2,4,4,3};
        int[] arr1 = {4,3};
        int n= arr.length;
        int m = arr1.length;
        int union1 = FindSizeOfRemovedElmt(arr, arr1,n,m);
        System.out.println(union1);
    }

    private static int FindSizeOfRemovedElmt(int[] arr, int[] arr1, int n, int m) {
        int count=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for (int b : arr1){
            if(map.containsKey(b) && map.get(b)>0){
                count++;
                map.put(b,map.get(b)-1);
            }
        }
        return count;
    }
}
