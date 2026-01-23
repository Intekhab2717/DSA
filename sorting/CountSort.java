package sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 5, 3,1,8,6};
        if(arr == null ||arr.length<=1){
            return;
        }
        int max=arr[0];
        for (int num : arr){
            max=Math.max(max,num);
        }
        int[] frequency =new int[max+1];
        for (int num : arr){
            frequency[num]++;
        }
        int index=0;
        for (int i = 0; i <frequency.length; i++){
            while(frequency[i]>0){
                arr[index]=i;
                index++;
                frequency[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
