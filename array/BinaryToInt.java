package mycode;

public class BinaryToInt {
    public static void main(String[] args) {
       //int a= 9;
        int num=0 , pov=0;
//        while(a>0){
//            System.out.println(a);
//            int mod=a%10;
//            num= (int) (Math.pow(2,pov)*mod+num);
//            //num=num*2+mod;
//            a=a/10;
//            pov++;
//        }
//        System.out.println(num);
        String s= "1000";
        for (int i = 0; i < s.length(); i++) {
            num= num*2+s.charAt(i)-'0';
        }

        System.out.println(num);
    }
}
