package hashMap;

import java.util.HashMap;

public class StringAnagamUsingHamhMap {
    public static void main(String[] args) {
        String a="abcdef";
        String b="fabcedd";
        if(a.length()!=b.length()){
            System.out.println("false");
            System.exit(-1);
        }
        HashMap<Character,Integer> map =new HashMap<>();
        for (char ch : a.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch : b.toCharArray()) {
            if (map.containsKey(ch) && map.get(ch)>0){
                    map.put(ch, map.get(ch)-1);
            }else {
                System.out.println("false");
                System.exit(-1);
            }
        }
        System.out.println("true");
    }
}
