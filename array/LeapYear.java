package mycode;

public class LeapYear {
    public static void main(String[] args) {
        int n=2700;
        if(n%400==0 || (n%4==0 && n%100!=0)){
            System.out.println("yes prime hai");
        } else {
            System.out.println("No prime hai");
        }
    }
}
