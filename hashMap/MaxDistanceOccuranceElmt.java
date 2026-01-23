package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxDistanceOccuranceElmt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,2};
        int max=0,val=0;
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                val=map.get(arr[i]);
                max=Math.max(max,(i-val));
            } else {
                map.put(arr[i],i);
            }
        }
        System.out.println(max);
    }
}
