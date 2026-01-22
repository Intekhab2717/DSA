package mycode;

public class VowelPurmutation {
    public static void main(String[] args) {
        String s="aieou";
        int n=vowelCount(s);
        System.out.println("final :"+n);
    }
    public static int vowelCount(String s) {
        // code here
        String vowels = "aeiouAEIOU",reselVowel="";
        int count=0,sameVowelCount=0,res=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(reselVowel.indexOf(ch) != -1){
                sameVowelCount++;
            }
            if (vowels.indexOf(ch) != -1) {
                count++;
                reselVowel=reselVowel+""+ch;
            }
        }
        int result = 1;
        System.out.println(count);
        int exactCount= count-sameVowelCount;
        for (int i = 1; i <= exactCount; i++) {
            result *= i;
        }
        if(sameVowelCount>0){
            while(sameVowelCount>0) {
                result = result*2;
                sameVowelCount--;
            }
            res=result;
        }
        return res;
    }
}
