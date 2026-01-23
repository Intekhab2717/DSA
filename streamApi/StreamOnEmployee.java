package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOnEmployee {
    public static void main(String[] args) {
        List<Employee> emp= Arrays.asList(new Employee("Intekhab",17,"IT",20000) ,
                new Employee("Zeshan",17,"ART",30000) ,
                new Employee("Haidr",17,"ART",15000) ,
                new Employee("Zahid",17,"Banking",40000));

       //get employee by deprt.
        Map<String, List<Employee>> groupByDept=emp.stream().collect(Collectors.groupingBy(e-> e.getDept()));
        System.out.println(groupByDept);
//get number Employee in each dept.
        Map<String, Long> res=emp.stream().collect(Collectors.groupingBy(e-> e.getDept(), Collectors.counting()));
        System.out.println(res);
    //Employye name starts with specefic nmae.
        Map<String, List<Employee>> groupByName=emp.stream().collect(Collectors.groupingBy(e-> String.valueOf(e.getName().startsWith("Z"))));
        System.out.println(groupByName);

        Map<String, List<Employee>> groupByName1=emp.stream().collect(Collectors.groupingBy(e->e.getName().startsWith("Z")?"StartWithZ":"Othes"));
        System.out.println(groupByName1);

        Map<Boolean, List<Employee>> groupByName2=emp.stream().collect(Collectors.groupingBy(e->e.getName().startsWith("Z")));
        System.out.println(groupByName2);

        //gropu by average salary per dept.
        Map<String, Double> groupBysalartPerDept=emp.stream().collect(Collectors.groupingBy(e->e.getDept(),Collectors.averagingInt(e->e.getSalary())));
        System.out.println(groupBysalartPerDept);

    }
}
