package mycode;

import java.util.Arrays;

public class SortZeroonFront {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,0,0,0};
        int f=0,l=arr.length-1,temp=0;
        while(f<l){
            if(arr[l]==0 && arr[f]==1){
                System.out.println(f);
                temp=arr[f];
                arr[f]=arr[l];
                arr[l]=temp;
                l--;
                f++;
            } else if(arr[l]==1){
                l--;
            } else {
                f++;
            }
            //l--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
