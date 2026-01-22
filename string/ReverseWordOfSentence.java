package string;

public class ReverseWordOfSentence {
    public static void main(String[] args) {
        String s="asdf ghjk qwer tyui";
        String temp="";
        String temp1="";
        for(char ch : s.toCharArray()){
            temp=ch+temp;
            if(ch==' '){
                temp1=temp1+temp;
                temp="";
            }
        }
        temp1=temp1+" "+temp;
        System.out.println(temp1);
    }
}
