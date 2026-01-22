package mycode;

import java.util.Arrays;
import java.util.HashMap;

public class SumEqualToTarget {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,9,8,5};
        int target= 9;
        int[] res=find1(arr,target);
        System.out.println(Arrays.toString(res));
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i <arr.length ; i++) {
//            if(map.containsKey((target-arr[i]))){
//                System.out.println((target-arr[i])+" "+arr[i]);
//                System.out.println(map.get((target-arr[i]))+" "+i);
//                break;
//            } else{
//                map.put(arr[i],i);
//            }
//        }
    }

    private static int[] find1(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey((target-arr[i]))){
                System.out.println((target-arr[i])+" "+arr[i]);
                System.out.println(map.get((target-arr[i]))+" "+i);
                return new int[]{map.get(target-arr[i]),i};
            } else{
                map.put(arr[i],i);
            }
        }
        return null;
    }
}
