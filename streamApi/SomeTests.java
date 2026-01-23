package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class SomeTests {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,7,2,9);
        List<Integer> list1=list.stream().sorted().toList();
        System.out.println(list1);
        List<Integer> list2=list.stream().sorted((a,c)->c-a).toList();
        System.out.println(list2);

        List<Integer> even=list.stream().filter(x->x%2==0).toList();
        System.out.println(even);

        int sum=list.stream().reduce(0,(a,b)->(a+b));
        System.out.println(sum);

        int sum1=list.stream().reduce(0,Integer::sum);
        System.out.println(sum1);

        Map<Boolean, List<Integer>> EvenOdd=list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(EvenOdd.get(true)+""+EvenOdd.get(false));

        Map<String, List<Integer>> EvenOdd1=list.stream().collect(Collectors.groupingBy(x->(x%2==0)?"Even":"Odd"));
        System.out.println(EvenOdd1.get("Even")+""+EvenOdd1.get("Odd"));

        String str="asdafghd";

        Map<Character, Long> fre=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(fre);


    }
}
