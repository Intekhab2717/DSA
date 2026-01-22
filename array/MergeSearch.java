package mycode;

import java.util.Arrays;

public class MergeSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8};
        int t=4,s=0,e=arr.length;
        int[] result=mergeSearch(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSearch(int[] arr) {
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;
        int[] left=mergeSearch(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSearch(Arrays.copyOfRange(arr,mid,arr.length));
        return sort(left,right);
//        while(s<=e) {
//            int mid=(s+e)/2;
//            if(arr[mid]==t){
//                return mid;
//            } else if (arr[mid]>t) {
//                e=mid-1;
//            } else {
//                s=mid+1;
//            }
//            System.out.println("enter");
//        }
//        return -1;
    }

    private static int[] sort(int[] left, int[] right) {
//      //  int i = left.length + right.length;
        int[] mix= new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length && j<right.length) {
            if (left[i] <= right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length) {
            mix[k]=left[i];
            i++;
            k++;
        }

        while(j<right.length) {
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
