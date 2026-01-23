package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CheckTwoArrayEqual {
    public static void main(String[] args) {
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        int[] a={1, 2, 5, 4, 0};
        int[] b={2, 1, 5, 0, 4};
        for (int n : a){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for (int n : b){
            if(map.containsKey(n) && map.get(n)!=0) {
                map.put(n,map.get(n)-1);
            } else {
                System.out.println("false");
            }
        }
        System.out.println("True");
    }
}
