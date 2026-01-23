public class StringAnagram {
    private static boolean checkAnaGram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int count=0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.contains(String.valueOf(s1.charAt(i))) && s1.contains(String.valueOf(s2.charAt(i)))){
                count++;

            }
        }
       return s2.length()==count?true:false;
    }

    public static void main(String[] args) {
        String s1 = "abaacddddd";
        String s2 = "aadaddddbc";
        System.out.println(checkAnaGram(s1, s2));
    }
}
