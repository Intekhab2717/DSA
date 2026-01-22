package mycode;

import java.util.HashMap;

public class HieghestFreOfChar {
    public static void main(String[] args) {
        String str="qwttertgfdrrorkj";
        int max=check1(str);
        System.out.println(max);
    }

    private static int check1(String str) {
        HashMap<Character,Integer> map= new HashMap<>();
        int max=Integer.MIN_VALUE;
        for (char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for (char ch : str.toCharArray()){
            int val=map.getOrDefault(ch,0);
            if(val>max) {
                max=val;
            }
        }
        return max;
    }
}
