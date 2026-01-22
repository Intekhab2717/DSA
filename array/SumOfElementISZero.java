package mycode;

import java.util.*;

public class SumOfElementISZero {
    public static void main(String[] args) {
        int[] arr={-8,-10,-10,-10,10,6,1,10};
        ArrayList<ArrayList<Integer>> list =new ArrayList<ArrayList<Integer>>();
        list =findSum(arr);
        System.out.println(list);
    }

    private static ArrayList<ArrayList<Integer>> findSum(int[] arr) {
        ArrayList<ArrayList<Integer>> list =new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int st=0,end=arr.length-1;
        int flag=0;
        while(st<end){
            int sum=arr[st]+arr[end];
            System.out.println(arr[st]);
            System.out.println(arr[end]);
            System.out.println("Sum "+sum);
            if(sum==0){
                ArrayList<Integer> list1=new ArrayList<Integer>();
                //Set<ArrayList<Integer>> set =new HashSet<>();
                list1.add(arr[st]);
                list1.add(arr[end]);
                list.add(list1);
                //list.add(list1);
                flag=1;
                st++;
                end--;
            } else if(sum<0){
                st++;
            } else {
                end--;
            }
        }
        Set<ArrayList<Integer>> set =new LinkedHashSet<>(list);
        ArrayList<ArrayList<Integer>> list2 =new ArrayList<ArrayList<Integer>>(set);
        return list2;
    }
}
