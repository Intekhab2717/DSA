package mycode;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {6,2,2,5,3,4,3,1};
        int[] arr1 = {3,7,6,5,2,6,3};
        int n= arr.length;
        int m = arr1.length;
        List<Integer> union1 = intersetion(arr, arr1,n,m);
        System.out.println(union1);
    }
    private static List<Integer> intersetion(int[] arr, int[] arr1, int n, int m) {
        List<Integer> list = new LinkedList<>();
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num1 : arr1){
            if(map.containsKey(num1) && map.get(num1)>0){
                list.add(num1);
                map.put(num1,map.get(num1)-1);
            }
        }
        Collections.sort(list);
        return list;
    }
}
