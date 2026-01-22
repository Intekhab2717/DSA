package mycode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={-3,-1,1,1,1};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        //Set<Integer> set =new HashSet<>();
        int[] arr1= new int[nums.length];
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i< nums.length;i++){
            //set.add(nums[i]);
            if(nums[i] != nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i <count; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        return count;
    }
}
