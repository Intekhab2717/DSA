package string;

public class SubSequence {
    public static void main(String[] args) {
        String A="AXY";
        String B = "YADXCP";
        int i=0,j=0;
        while(i<A.length() && j<B.length()) {
            if(A.charAt(i)==B.charAt(j)){
                i++;
            } else {
                j++;
            }
        }
        if(A.length()==i){
        //return true;
        }

        
        System.out.println(1);
    }
}
