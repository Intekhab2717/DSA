package string;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s= "asdfghtasoiqbuyttyxuiohdfgh";
        int[] fr=new int[26];
        HashMap<Character,Integer> freq= new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        System.out.println(freq);
        for (HashMap.Entry<Character,Integer> entry : freq.entrySet()) {
            if(entry.getValue()==1) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("--------- 2nd Approach if only alphbet is ---------");
        for(char ch : s.toCharArray()){
            //freq.put(ch,freq.getOrDefault(ch,0)+1);
            fr[ch-'a']++;
        }

        for(char ch : s.toCharArray()){
            //freq.put(ch,freq.getOrDefault(ch,0)+1);
            if(fr[ch-'a']==1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
