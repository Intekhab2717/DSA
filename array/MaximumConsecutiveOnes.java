package mycode;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        //int[] arr ={1,1,1,0,0,1,1,1,1};
        int[] arr ={0,0,1,1,1,1,1,0,0,1,1,0,1,1,1,1,0};
        int conu=0,max=0;
        for(int i : arr){
            if(i==1){
                conu++;
                max=Math.max(max,conu);
            } else {
                conu=0;
            }
        }
        System.out.println(max);
    }
}
