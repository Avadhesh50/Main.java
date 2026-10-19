import Java8.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Collectors;

public class Test{

    public static void main(String[] args) {


        String str  ="java spring boot java";

        Map<String,Long> result =   Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new,
                Collectors.counting()));

        System.out.println(result);



       // System.out.println("Try clicking the Run button.");

      //  System.out.println("Test"+result);

}}
