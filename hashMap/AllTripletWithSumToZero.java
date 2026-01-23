package hashMap;

import java.util.*;

public class AllTripletWithSumToZero {
    public static void main(String[] args) {
        int[] arr={0, -1, 2, -3, 1};
        int target=-2;
        HashSet<List<Integer>> set =new HashSet<>();
        List<List<Integer>> list =new ArrayList<>();
        HashMap<Integer,List<int[]>> map =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                map.computeIfAbsent(arr[i] + arr[j],
                        k -> new ArrayList<>()).add(new int[]{i, j});
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int val=target-arr[i];
            if(map.containsKey(val)){
                List<int[]> piar= map.get(val);
                for (int[] p: piar) {
                    if(p[0]!=i && p[1]!=i){
                        List<Integer> curr = Arrays.asList(i,p[0],p[1]);
                        Collections.sort(curr);
                        set.add(curr);
                    }
                }
            }
        }

        System.out.println(new ArrayList<>(set));
    }
}
