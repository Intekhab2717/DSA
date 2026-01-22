package mycode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithMap {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,5,7,9,4,2,5,6,7,4,5);
        List<Integer> odd  = list.stream().filter(n->n%2!=0).distinct().toList();
        List<Integer> even  = list.stream().filter(n->n%2==0).distinct().toList();
        System.out.println(odd);
        System.out.println(even);
        List<List<Integer>> newList = new ArrayList<List<Integer>>();
        newList.add(odd);
        newList.add(even);
        HashMap<String,List<Integer>> map = new HashMap<>();
        map.put("Odd",odd);
        map.put("even",even);
        System.out.println(map);
        HashMap<String,List<List<Integer>>> map1 = new HashMap<>();
        map1.put("data",newList);
        System.out.println("map1"+map1);
    }
}
