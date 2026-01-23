package hashMap;

import java.util.*;

public class MostFrequentElmt {
    public static void main(String[] args) {
        int[] arr={1, 3, 2, 7, 4, 5,8,9};
        int max=0,val=0,key=arr[0];
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        for(int a : arr){
            if(map.containsKey(a)){
                val=map.get(a);
                val=val+1;
                map.put(a,val);
                //max=Math.max(max,map.getOrDefault(a,0));
                if(val>max) {
                    max=val;
                    key=a;
                }
            } else {
                //max=1;
                //key=a;
                map.put(a,1);
            }
            //map.put(a,map.getOrDefault(a,0)+1);
            //max=Math.max(max,map.getOrDefault(a,0));
        }
        System.out.println(key);
    }
}
