package mycode;

import java.util.Arrays;

public class MoveZerosAtlast {
    public static void main(String[] args) {
        int[] arr ={2,0,5,7,0,9,0,4,2,6,0};
        int index=0,n= arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<n){
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
