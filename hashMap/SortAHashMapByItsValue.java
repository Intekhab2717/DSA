package hashMap;

import java.util.*;
///this code sort a hashmap by its key/value and also gives char which have highest freq.
public class SortAHashMapByItsValue {
    public static void main(String[] args) {
        String s= "asdfghjasdfghjkmngfd";
        int max=Integer.MIN_VALUE;
        char key =' ';
        HashMap<Character,Integer> map =new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println("fist map"+map);
        List<Map.Entry<Character,Integer>> list = new LinkedList<>(map.entrySet());
        list.sort((i1, i2) -> i1.getValue().compareTo(i2.getValue()));

        System.out.println("list hao "+list);

        HashMap<Character,Integer> temp =new LinkedHashMap<>();

        for (Map.Entry<Character,Integer> tm : list) {
            temp.put(tm.getKey(),tm.getValue());
            if (tm.getValue()>max) {
                max=tm.getValue();
                key=tm.getKey();
            }
        }

        System.out.println("second map"+temp);
        System.out.println(" highest value of "+ key +" of is : "+max);
    }
}
