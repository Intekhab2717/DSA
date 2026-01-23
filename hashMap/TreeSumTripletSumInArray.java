package hashMap;

import java.util.Arrays;

public class TreeSumTripletSumInArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 3, 6, 7};
        int n= arr.length;
        int target=10;
        //int n = arr.length;
        Arrays.sort(arr);

        // Fix the first element as arr[i]
        for (int i = 0; i < n - 2; i++) {

            // Initialize left and right pointers with
            // start and end of remaining subarray
            int l = i + 1, r = n - 1;

            int requiredSum = target - arr[i];
            while (l < r) {
                if (arr[l] + arr[r] == requiredSum) {
                    System.out.println("true");
                    break;
                }
                if (arr[l] + arr[r] < requiredSum)
                    l++;
                else if (arr[l] + arr[r] > requiredSum)
                    r--;
            }
        }

        //return false;
        //System.out.println("false");
    }
}
