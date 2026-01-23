package sorting;

import java.util.Arrays;

public class QueckSort {

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 4, 5, 3,1,8,6};
        int low=0,high= arr.length-1;
        queckSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

    private static void queckSort(int[] arr, int low, int high) {
        if (low<high){
            int index = pivoteIndex(arr,low,high);
            queckSort(arr,low,index-1);
            queckSort(arr,index+1,high);
        }
    }

    private static int pivoteIndex(int[] arr, int low, int high) {
        int i=low,j=high;
        int pivot=arr[low];
        while (i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if (i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}
