package mycode;

import java.util.Arrays;

public class RotedOnce {
    public static void main(String[] args) {
        int[] arr ={6,1,2,3,4,5};
        int count =0;
        for (int i = 1; i < arr.length; i++) {
            //int count =0;
            if (arr[i]<arr[i-1]){
                count++;
            }
        }
        if(count==1)
            System.out.println("yes");
        else
            System.out.println("NO");
        System.out.println(Arrays.toString(arr));
    }
}
