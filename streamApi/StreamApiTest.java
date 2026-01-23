import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiTest {
    public static void main(String[] args) {
        int[] a={1,2,1,2,4,3,4,2};
        int[] distintSorted = Arrays.stream(a).distinct().sorted().toArray();
        System.out.println(Arrays.toString(distintSorted));
        Integer secondSmallest = Arrays.stream(a).boxed().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println(secondSmallest);
        //System.out.println(Arrays.toString(i));
        //String s="swiss";
//        int i = Arrays.stream(a).max().getAsInt();
//        System.out.println(i);
        //ArrayList<Integer> resveSorted = (ArrayList<Integer>) IntStream.range(0,a.length).mapToObj(i->a[a.length-1-i]).collect(Collectors.toList());
        Integer[] resveSorted = IntStream.range(0,a.length)
                .mapToObj(i->a[a.length-1-i]).distinct().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        System.out.println(Arrays.toString(resveSorted));
        Integer secondLargest = Arrays.stream(a).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);

        int sum = (int) Arrays.stream(a).distinct().sum();
        System.out.println(sum);

        int average = (int) Arrays.stream(a).distinct().average().getAsDouble();
        System.out.println(average);

        int count = (int) Arrays.stream(a).distinct().count();
        System.out.println(count);

        List<Integer>list =Arrays.asList(1,2,1,2,4,3,4,2);
        Set<Integer> dublicates = list.stream().filter(j->Collections.frequency(list,j)>1)
                .collect(Collectors.toSet());
        System.out.println(dublicates);

        Integer notDuplicate = list.stream().filter(j->Collections.frequency(list,j)==1).findFirst().orElse(null);
        System.out.println(notDuplicate);
    }
}
