package mycode;
import java.util.*;
public class UnionOfSortedArray { //no duplicates.
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 5, 6};
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int n= arr1.length;
        int m = arr.length;
        List<Integer> union1 = union1(arr1, arr,n,m);
        System.out.println(union1);
    }

    private static List<Integer> union1(int[] arr, int[] arr1, int n, int m) {
        List<Integer> list = new LinkedList<>();
        int i=0,j=0;
        int prev=0;
        while(i<n && j<m) {
            if(arr[i]<arr1[j]){
                if(list.isEmpty() || prev!=arr[i]) {
                    list.add(arr[i]);
                    prev = arr[i];
                }
                i++;
            } else {
                if(list.isEmpty() || prev!=arr1[j]) {
                    list.add(arr1[j]);
                    prev = arr1[j];
                }
                j++;
            }
        }
        while (i<n) {
            if(prev!=arr[i]) {
                list.add(arr[i]);
                prev = arr[i];
            }
            i++;
        }
        while (j<m) {
            if(prev!=arr1[j]) {
                list.add(arr1[j]);
                prev = arr1[j];
            }
            j++;
        }
        return list;
    }
}