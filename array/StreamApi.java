package mycode;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,5,7,9,4,2,5,6,7,4,5);
        //List<Integer> list = List.of(2,2,2,2,2,2,2);
        List<Integer> list1  = list.stream().filter(n->n%2!=0).distinct().toList();
        List<Integer> list2  = Stream.concat(list.stream().filter(n->n%2!=0),list.stream().filter(n->n%2==0)).distinct().toList();
        System.out.println(list1);
        System.out.println(list2);
        Optional<Integer> a = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        a.ifPresentOrElse(val-> System.out.println("second: "+val),()-> System.out.println("No found"));
        //System.out.println("--"+list3);
    }
}
