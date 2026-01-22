package mycode;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurentHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> InterviewBit_map = new HashMap<String, Integer>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(InterviewBit_map);
        syncMap.put("Hashmap Implementation",21);
        syncMap.put("in ",32);
        syncMap.put("Java",43);
        //syncMap.put(99,"InterviewBit");
        System.out.println(syncMap);
        HashMap<String, Integer> InterviewBit_map1 = new HashMap<String, Integer>();
        InterviewBit_map1.put("Hashmap Implementation",21);
        InterviewBit_map1.put("in ",32);
        InterviewBit_map1.put("Java",43);
        System.out.println(InterviewBit_map);
        InterviewBit_map.clear();
        System.out.println(InterviewBit_map);
        System.out.println(InterviewBit_map1);
        InterviewBit_map1.clear();
        System.out.println(InterviewBit_map1);
    }
}
