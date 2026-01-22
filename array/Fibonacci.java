package mycode;

import java.sql.SQLOutput;

public class Fibonacci {
    public static void main(String[] args) {
        int val1=0;
        int val2=1;
       // System.out.print(val1+" "+val2);
        for (int i=0;i<10;i++){
            System.out.println(fibonacci(i));
        }
        //fibonacci(10);
    }
//    private static void fibonacci(int val1, int val2,int i) {
//        if(i==0){
//            System.exit(0);
//        }
//        System.out.print(" ");
//        System.out.print(val1+val2);
//        fibonacci(val2,val1+val2,--i);
//    }
    private static int fibonacci(int i) {
        if(i<=1){
            //System.out.print(i);
            return i;
        }
//        System.out.print(" ");
//        System.out.print(val1+val2);
        return fibonacci(i-1)+fibonacci(i-2);
    }
}
