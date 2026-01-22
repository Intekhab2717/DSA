package mycode;

public class PowerByRecursion {
    public static void main(String[] args) {
        int n=2,p=5,res=0;
//        for(int i=1;i<=p;i++){
//            res=res*n;
//        }
        int res1= myPower(n,p);
        System.out.println(res1);
    }
    private static int myPower(int n, int p) {
        if(p==0)
            return 1;
        return n*myPower(n,p-1);
    }
}
