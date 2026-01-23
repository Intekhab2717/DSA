package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistintInWindowK {
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 3, 4, 2, 3};
        int k=4;
        ArrayList<Integer> list = findDistn(arr,k);
        System.out.println(list);
    }

    private static ArrayList<Integer> findDistn(int[] arr, int k) {
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        for (int i = k; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0){
                map.remove(arr[i-k]);
            }
            list.add(map.size());
        }
        return list;
    }
}
