package mycode;

import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8};
        int t=4,s=0,e=arr.length;
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSortInplace(int[] arr, int s, int e) {
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergeSortInplace(arr,0,mid);
        mergeSortInplace(arr,mid,e);
        sort(arr,0,mid,e);
    }

    private static void sort(int[] arr,int s, int mid, int end) {
//      //  int i = left.length + right.length;
        int[] mix= new int[end-s];
        int i=0;
        int j=mid;
        int k=0;
        while (i<mid && j<end) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<mid) {
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j<end) {
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l <mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }
}
