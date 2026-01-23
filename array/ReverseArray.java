import ch.qos.logback.core.net.SyslogOutputStream;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr ={2,3,4,6,31,9,1,5,8};//4,9,31,6,4,3,2
        int k=3;
        reverse(arr);
//        for (var i = 0; i < k; i++){
////            int a=arr[arr.length-1-i];
////            arr[arr.length-1-i]=arr[i];
////            arr[i]=a;
//
////            arr[arr.length-1-i] = arr[arr.length-1-i]+arr[i];
////            arr[i]=arr[arr.length-1-i]-arr[i];
////            arr[arr.length-1-i]=arr[arr.length-1-i]-arr[i];
//
//        }
        //for(int a:arr){
//            for (var i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }

//        String s1 = "abaacddddd";
//        String s2 = "aadaddddbc";
//        System.out.println(checkAnaGram(s1, s2));
    }
    public static void reverse(int []arr){
       for (int i=0;i<arr.length/2;i++){
           int a=arr[arr.length-1-i];
           arr[arr.length-1-i]=arr[i];
           arr[i]=a;
       }
        for (var i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
