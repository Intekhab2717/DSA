package mycode;

public class IntegerToBinary {
    public static void main(String[] args) {
        int a=8;
        StringBuilder sb = new StringBuilder();
        while(a>0){
            sb.append(a % 2);
            a=a/2;
        }
        //System.out.println(s);
        System.out.println(sb.reverse().toString());
    }
}
