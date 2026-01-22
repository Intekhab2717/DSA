package mycode;

import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        //int[] arr = {1,2,2,3,3,4,5,6};
        int[] arr = {1,2,2,3,3,4,5,6};
        int[] arr1 = {2,3,3,5,6,6,7,8};
        int n= arr.length;
        int m = arr1.length;
        List<Integer> union1 = intersetion(arr, arr1,n,m);
        System.out.println(union1);
    }

    private static List<Integer> intersetion(int[] arr, int[] arr1, int n, int m) {
        List<Integer> list = new LinkedList<>();
        int i=0,j=0;
        int prev=0;
        while(i<n && j<m) {
            if(arr[i]==arr1[j]){
                list.add(arr[i]);
                i++;
                j++;
            } else if(arr[i]<arr1[j]) {
                i++;
            } else {
                j++;
            }
        }
        return list;
    }
}
