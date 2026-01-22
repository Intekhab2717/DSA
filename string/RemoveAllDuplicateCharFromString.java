package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveAllDuplicateCharFromString { //if all are char alphabet
    public static void main(String[] args) {
        boolean[] b= new boolean[256];
        String s= "asdfghgfdsaasertyg)(*&^";
        String res = "";
        StringBuilder sb =new StringBuilder();
//        for(char ch : s.toCharArray()){
//            if(b[ch-'a']==false){
//                res=res+ch;
//            }
//            b[ch-'a']=true;
//        }
        //System.out.println(res);
        Set<Character> set = new HashSet<>();
        int size=-1;
        for(char ch1 : s.toCharArray()){
            set.add(ch1);
            if (set.size()>size){
                res=res+ch1;
                sb.append(ch1);
                size= set.size();
            }
        }
        System.out.println(set);
        System.out.println(res);
        System.out.println(sb);
        String temp="";
        for (char c : set){
            temp=temp+c;
        }
        System.out.println(temp);
    }
}
