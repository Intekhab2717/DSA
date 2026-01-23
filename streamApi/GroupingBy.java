package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        //Even and odd.
        List<Integer> list = Arrays.asList(1,2,4,6,8,9,4,2);
        Map<String,List<Integer>> evenOdd = list.stream().sorted().collect(Collectors.groupingBy(x->(x%2==0?"Even":"Odd")));
        System.out.println(evenOdd.get("Even"));
        System.out.println(evenOdd.get("Odd"));

        //Char friequency.
        String s="jhgtyudkfjhg";
        Map<Character, Long> evenOdd1= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(evenOdd1);
    }
}
