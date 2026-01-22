package string;

public class ReverseSentenceAndWordAsWell {
    public static void main(String[] args) {
        String s="asdf ghjk qwer tyui";
        String temp="";
        String temp1="";
        for(char ch : s.toCharArray()){
            temp=ch+temp;
            if(ch==' '){
                temp1=temp+temp1;
                temp="";
            }
        }
        temp1=temp+" "+temp1;
        System.out.println(temp1);
    }
}
