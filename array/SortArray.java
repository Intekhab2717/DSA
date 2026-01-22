package mycode;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
      int[] nums={5,3,3,1};
      int[] arr1 = sortArray(nums);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] sortArray(int[] nums) {
        int i=1;
        while(i<nums.length){
            if( i>0 && nums[i]<nums[i-1]){
                    int temp =nums[i];
                    nums[i]=nums[i-1];
                    nums[i-1]=temp;
                    i--;
            }else{
                i++;
            }
        }
        return nums;
    }
}
