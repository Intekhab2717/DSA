package mycode;

public class MaxOfKSizeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,2,3,6};
        //int[] arr = {5,1,3,4,2,6};
        int k=3,count=0,max=0;
        for(int i=0;i<=arr.length-k;i++){
            while(count<k){
                max=Math.max(max,arr[i+count]);
                count++;
            }
            System.out.print(max+" ");
            max=0;
            count=0;
        }
    }
}
