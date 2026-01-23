package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 4, 5, 2,1,8,6};
        int low=0,high= arr.length-1;
        mergeSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeElement(arr,low,mid,high);
    }
    private static void mergeElement(int[] arr, int low, int mid, int high) {
        int left=low;
        int right=mid+1;
        ArrayList<Integer> list = new ArrayList<>();
        while(left<=mid && right<=high) {
            if (arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            list.add(arr[left]);
            left++;
        }
        while (right<=high){
            list.add(arr[right]);
            right++;
        }
//        int index=0;
//        for (int num : list){
//            arr[index]=num;
//            index++;
//        }
        for (int i = low; i <= high; i++) {
            arr[i]= list.get(i-low);
        }
    }
}
