package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartioningBy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,6,8,9,4,2);
        Map<Boolean,List<Integer>> evenOdd = list.stream().sorted().collect(Collectors.groupingBy(x->(x%2==0)));
        System.out.println(evenOdd.get(true)); //Enen
        System.out.println(evenOdd.get(false)); // odd
    }
}
