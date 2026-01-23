package sorting;

//import static java.util.Collections.swap;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={3,7,9,4,5,2};
        int n=arr.length-1,min=0;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i;j<=n;j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
