package mycode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8};
        int t=4,s=0,e=arr.length;
        int result=search(arr,t,s,e);
        System.out.println(result);
    }
//    public static int search(int[] arr,int t,int s,int e) {
//        while(s<=e) {
//            int mid=(s+e)/2;
//           if(arr[mid]==t){
//               return mid;
//           } else if (arr[mid]>t) {
//               e=mid-1;
//           } else {
//               s=mid+1;
//           }
//            System.out.println("enter");
//        }
//        return -1;
//    }

    public static int search(int[] arr,int t,int s,int e) {
        if(s>e) {
            return -1;
        }
            int mid=(s+e)/2;
           if(arr[mid]==t){
               return mid;
           } else if (arr[mid]>t) {
               e=mid-1;
               return search(arr,t,s, e);
           } else {
               s=mid+1;
               return search(arr,t,s, e);
           }
            //System.out.println("enter");

        //return -1;
    }
}
