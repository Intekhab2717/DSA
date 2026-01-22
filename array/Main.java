package mycode;

public class Main {
    public static void main(String[] args) {
        findDupAndMissingNum(new int[] {1,2,3,5,5});
    }
    private static void findDupAndMissingNum(int[] a) {
        int n = a.length;
        int sumOfN = n*(n+1)/2;
        int dup = -1;
        int sum = 0;
        for (int i = 0; i<n-1; i++){
            int res = a[i] ^ a[i+1];
            if(res == 0){
                dup = a[i+1];
                a[i+1] = res;
                //break;
            }
            sum += a[i];
        }
        sum+=a[n-1];
        System.out.println(dup + " "+ (sumOfN-sum));
    }
}
