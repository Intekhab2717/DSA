package Stack;

public class StachUsingArray {
    static int top=-1;
    static int[] a= new int[10];
    public static void main(String[] args) {
        int[] a= new int[10];
        int pushed=0,poped=0,onTop=0,sije=0;
        String status="";
        status= IsEmptyy();
        System.out.println("Stach is : "+status);
         pushh(10);
        status= IsEmptyy();
        System.out.println("Stach is : "+status);
        pushh(1);
        pushh(11);
        pushh(14);
        pushh(13);
        pushh(101);

        sije=siize();
        System.out.println("Size is : "+sije);
        onTop=topp();
        System.out.println(onTop);
        poped=popp();
        System.out.println(poped);
        onTop=topp();
        System.out.println(onTop);
        poped=popp();
        System.out.println(poped);
        System.out.println("--------------");
        sije=siize();
        System.out.println("Size is : "+sije);
        onTop=topp();
        System.out.println(onTop);
    }

    private static String IsEmptyy() {
        return (top==-1)?"Empty":"NotEmpty";
    }

    private static int siize() {
        if (top==-1){
            System.out.println("Stack in Empty");
            return -1;
        }

        return top+1;
    }

    private static int topp() {
        if (top==-1){
            System.out.println("Stack in Empty");
            return -1;
        }

        return a[top];
    }

    private static int popp() {
        int val=a[top];
        a[top]=0;
        top=top-1;
        return val;
    }

    private static void pushh(int val) {
        top=top+1;
        a[top]=val;
        System.out.println("Pussded : "+val);
    }

}
