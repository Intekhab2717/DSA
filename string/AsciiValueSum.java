package string;

import java.util.ArrayList;

public class AsciiValueSum {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        String s="xhnwazunnwdrkdmccz";
        ArrayList<Integer> list1 = asciirange(s);
        System.out.println(list1);
    }
    public static ArrayList<Integer> asciirange(String s) {
        // code here
        //ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] bl=new boolean[26];
        int st=0,l=0;
        for(char ch : s.toCharArray()){
            st=s.indexOf(ch);
            l=s.lastIndexOf(ch);
            if((st!=l && l-st>1) && bl[ch-'a']==false){
                sum(s,st,l);
            }
            bl[ch-'a']=true;
        }
        return list;
    }
    public static void sum(String s1, int i, int j){
        int sm=0;
        System.out.println(i+" "+j);
        for(int k=i+1;k<j;k++){
            sm=sm+s1.charAt(k);
        }
        list.add(sm);
    }
}
