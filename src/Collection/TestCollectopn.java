package Collection;

import Java8.Employee;

import java.util.*;

import java.util.stream.Collectors;
import java.util.function.Function;



public class TestCollectopn {

    public static void main(String [] args){

        /*
        List<String> list = new LinkedList<>();
        list.addAll("One","Two","Three","four","One");*/

        List<String> list = Arrays.asList("One","Two","Three","four","One");
        List<Integer> num = Arrays.asList(12,23,3,4,5,6,7,8,10,0,3,0,456,456,32);

        Set<Integer> st = new HashSet<>(num);

        System.out.println(st.stream().sorted().toList());
        System.out.println(st.stream().sorted(Comparator.reverseOrder()).toList());


       Map<Integer,Long> result =  num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

     String str  =  "aabccd";
     Character ch =  str.chars()
              .mapToObj(m -> (char)m)
              .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new,Collectors.counting()))
              .entrySet()
              .stream()
             .filter(f-> f.getValue() ==1L)
             .map(Map.Entry::getKey)
              .findFirst()
              .orElse(null);
        System.out.println(ch);

        // List<Employee> empsalary =   employees.stream().sorted(Comparator.comparingDouble(Employee:: getSDalary)).collect(Collectors.toList());


    }
}
