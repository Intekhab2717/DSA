package hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountPairSumEqualtarget {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target=6;
        int diff=0,count=0;
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        for(int a : arr){
            diff=target-a;
            if(map.containsKey(diff)){
                count+=map.get(diff);
                System.out.println(count);
            }
            map.put(a,map.getOrDefault(a,0)+1);

        }
        System.out.println(count);
    }
}
