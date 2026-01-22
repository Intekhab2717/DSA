package mycode;

import java.util.List;
import java.util.stream.Stream;

public class MergeOfTwoArrayUsingStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,5,7,8,1);
        List<Integer> list1 = List.of(1,3,2,6,5);
        List<Integer> list6 = Stream.concat(list.stream(), list1.stream())
                .distinct()
                .sorted()
                .toList();
        System.out.println("Merge og two list sorted nad distinct: "+list6);
        List<Integer> list3 = List.of(0,1,0,3,0,2,6,5,0);
        List<Integer> list4 = Stream.concat(list3.stream().filter(n->n==0),
                list3.stream().filter(n->n!=0))
                .toList();
        List<Integer> list5 = Stream.concat(list3.stream().filter(n->n!=0),
                list3.stream().filter(n->n==0))
                .toList();
        System.out.println(list4);
        System.out.println(list5);
    }
}
