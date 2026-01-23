package hashMap;

import java.util.ArrayList;
import java.util.List;

public class FindPythagoreanTripletWithGivenSum {
    public static void main(String[] args) {
        int target=60;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < target -2; i++) {
            for (int j = i+1; j < target-1; j++) {
                int c=target-i-j;
                if(c<=j){
                    continue;
                }
                if(c*c==i*i+j*j){
                    list.add(List.of(i,j,c));
                }
            }
        }
        System.out.println(list);
    }
}
