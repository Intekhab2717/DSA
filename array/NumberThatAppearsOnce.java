package mycode;

public class NumberThatAppearsOnce {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        int aa=findthatNumber(arr);
        System.out.println(aa);
    }

    private static int findthatNumber(int[] arr) {
        int xor=0;
        for(int i=0;i < arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
}
