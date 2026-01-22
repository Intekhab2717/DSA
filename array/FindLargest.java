package mycode;

public class FindLargest {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int i=0,maxI=0,maxN=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]<nums[j]){
                i=j;
            }
        }
        System.out.println(nums[i]);
        maxI=i;
        System.out.println(maxI);
        maxN=nums[i];
        System.out.println(maxN);
        nums[i]=-1;
        System.out.println(nums[i]);
        i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]<nums[j]) {
                i = j;
            }
        }
        System.out.println(nums[i]);
        if(maxN>=(2*nums[i])){
            System.out.println("double");
        } else {
            System.out.println("not double");
        }
    }
}
