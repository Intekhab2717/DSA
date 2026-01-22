package mycode;

import java.util.HashMap;

public class ChekArrayByMap {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,3,1,2,4,6,7,8,9,0,7,5,4,3};
        int[] arr1={1,2,4,6,3,1,2,4,7,7,8,9,0,7,5,4,3};
        boolean res=check(arr, arr1);
        System.out.println(res);
    }
    private static boolean check(int[] arr, int[] arr1) {

        HashMap<Integer,Integer> map= new HashMap<>();
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for (int i = 0; i <arr1.length ; i++) {
            if(map.containsKey(arr1[i])) {
                map.put(arr1[i], map.getOrDefault(arr[i], 0) - 1);
            } else{
                //System.out.println("Not equal");
                return false;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(map.getOrDefault(arr[i],0)==1){
                return false;
            }
        }
        return true;
    }
}
