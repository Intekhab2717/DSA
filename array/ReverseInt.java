package mycode;

public class ReverseInt {
    public static void main(String[] args) {
        long aa =reverse(1534236469L);
        System.out.println(aa);
    }

    public static long reverse(long x) {
        long original = x;
        long rev = 0;
        int sign = sign(x);
        x = x*sign;
        System.out.println(sign);
        System.out.println(x);
        while(x > 0){
            rev = (rev*10)+x%10;
            System.out.println(rev);
            x = x/10;
        }
        //rev =rev+1;
        System.out.println("--"+rev);
        rev = rev*sign;
        System.out.println(rev);
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        } else {
            return rev;
        }
        //return rev;
    }
    static int sign(long n) {
        if(n < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
