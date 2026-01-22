package mycode;

public class ElementleftSmallerNRightBigger {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7,8,9};
        int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && min < arr[i]) {
                min=Math.max(min,arr[i-1]);
                if(arr[i+1]>arr[i] && arr[i]<max){
                    max=Math.min(max,arr[i+1]);
                    //return arr[i];
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println(-1);
    }
}
