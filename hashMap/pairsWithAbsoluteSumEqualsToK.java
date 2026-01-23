package hashMap;

import java.util.HashMap;
import java.util.Map;

public class pairsWithAbsoluteSumEqualsToK {
    public static void main(String[] args) {
        int[] arr = {8, 16, 12, 16, 4, 0};
        int target=4;
        int diff=0,count=0,add=0;
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        for(int a : arr){
            diff=a-target;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            add=target+a;
            if(map.containsKey(add)){
                count+=map.get(add);
            }
            map.put(a,map.getOrDefault(a,0)+1);

        }
        System.out.println(count);
    }
}
