package Java8.dailyQ;
import Java8.Employee;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.HashMap.*;
import java.util.stream.*;

public class TestEmployeeObjAPIQ {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Rahul", "IT", 75000, 28),
                new Employee(102, "Priya", "HR", 55000, 32),
                new Employee(103, "Amit", "IT", 90000, 35),
                new Employee(104, "Sneha", "Finance", 85000, 29),
                new Employee(105, "Vikas", "IT", 65000, 26),
                new Employee(106, "Neha", "HR", 60000, 27),
                new Employee(107, "Rohit", "Finance", 95000, 38),
                new Employee(108, "Anjali", "IT", 80000, 31),
                new Employee(109, "Suresh", "Finance", 70000, 40),
                new Employee(110, "Pooja", "HR", 50000, 25),
                new Employee(111, "Arjun", "IT", 90000, 30),
                new Employee(112, "Kavita", "Finance", 85000, 34),
                new Employee(113, "Ramesh", "HR", 65000, 36),
                new Employee(114, "Anita", "IT", 72000, 28),
                new Employee(115, "Manoj", "Finance", 78000, 33)
        );

//    1Given a List<Integer>, use Streams to find the sum of all even numbers.
        List<Integer> list = List.of(2,3,5,6,8,9,10);
      int data8 =   list.stream().filter(f -> f%2==0).mapToInt(Integer :: intValue).sum();
        System.out.println(data8);

//   2 Convert a List<String> of names to a List<String> of uppercase names, sorted alphabetically.
        List<String> str = Arrays.asList("Avadhesh", "Kumar ","Yadav","Yadav");
        List<String> data81 = str.stream().map(String :: toUpperCase).sorted().toList();
        //a,e,i,o,u
//   3 Given a List<String>, count how many strings start with a vowel using Streams.
      long res3 =   str.stream()
                .filter(s -> "AEIOUaeiou".indexOf(s.charAt(0)) != -1)
                .count();

//  4  Find the maximum and minimum values in a List<Integer> using Stream.
        int min = list.stream().mapToInt(m ->m).summaryStatistics().getMin();
                  list.stream().mapToInt(m->m).summaryStatistics().getMax();

//  5  Given a List<String>, group them by their length into a Map<Integer, List<String>> using Collectors.groupingBy.
      Map<Integer, List<String>> data5 =   str.stream().collect(Collectors.groupingBy(String :: length));
//  6  Given a List<Employee> (with fields department, salary), find the average salary per department using Collectors.groupingBy + Collectors.averagingDouble.
         Map<String,Double>  data6 = employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment,
                Collectors.averagingDouble(Employee :: getSalary)));
//  7  Flatten a List<List<Integer>> into a single List<Integer> using flatMap.
        List<List<Integer>> int7 = List.of(List.of(1,2,3),List.of(4, 5, 6));
        int7.stream().flatMap(List ::stream ).toList();

//  8  Given a List<String>, find the first string with length greater than 5, using filter + findFirst.
      Optional<String> res8 =  str.stream().filter(f -> f.length()>5).findFirst();

//  9  Given a List<Employee>, partition them into two groups — those earning above 50,000 and those below — using Collectors.partitioningBy.
         employees.stream().collect(Collectors.partitioningBy(p ->p.getSalary() > 50000 ) );

//  10  Given a List<Employee>, find the employee with the highest salary in each department using groupingBy + Collectors.maxBy.
        Map<String, Optional<Employee>> data10 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        /// //=================================9/9/2026================

        List<String> str9 = Arrays.asList("Avadhesh","Kumar", "Yadav","Data");

            String str99 = String.join(" ", str9).toUpperCase();
            String str91 = String.join((CharSequence) ", ", str9);

        System.out.println(str91);
        /// //=================================9/9/2026================

        int[] numbers = {10, 20, 15, 30, 25, 20, 40,30};

        Integer data =
                Arrays.stream(numbers)
                        .boxed()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst().get();




        /// //=================================9/9/2026================
        //// find all numbers that occur more than once

       List<Integer> data2 =   Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry :: getKey)
                .toList();

        /// //=================================9/9/2026================
        //Find the highest-paid Employee in each department.

       Map<String,Employee> data3 =  employees.stream()
                .collect(Collectors.groupingBy(Employee ::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee ::getSalary)), Optional ::get)));

        /// //=================================9/9/2026================
        //Find all employees whose salary is greater than the company's average salary.
        /// //=================================21/9/2026================
        //Write the complete code to find the most frequently occurring number using Java 8 Stream API


        List<Integer> numbers2 =
                Arrays.asList(10, 20, 10, 30, 20, 10, 40,20, 30);

         // Optional<Integer> maxFrequent =  numbers2.stream();
//                .collect(Cllectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream().sorted(Comparator.comparingInt(Map.Entry.comparingByValue()vbbnnngggggggghgfsazzMN/a 52dsahtyttth).reversed())
//                .max(Map.Entry.comparingByValue())
//                .map(Map.Entry :: getKey);

//System.out.println(maxFrequent.orElse(null));

        /// //=================================9/9/2026================
        String input = "swiss";

                Character  result = input.chars()
                .mapToObj(m -> (char)m)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() ==1L)
                .map(Map.Entry ::getKey)
                        .findFirst()
                        .orElse(null);


        /// //=================================9/9/2026================

        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

        /// //=================================9/9/2026================
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(4,5,6);
        List<Integer> l3 = Arrays.asList(7,8,9);

        List<List<Integer>>  ll = Arrays.asList(l1,l2,l3);
        List<List<Integer>> lists =  Arrays.asList(Arrays.asList(1,2,3,4,5,6),Arrays.asList(7,8,9,10));
           ll.stream().flatMap(m->m.stream()).forEach(System.out::println);


        /// //=================================9/9/2026================
        /// //=================================9/9/2026================
        /// //=================================9/9/2026================
        /////System.out.println(result);
        /// //=================================9/9/2026================
        /// //=================================9/9/2026================
        /// //=================================9/9/2026================
        /// //=================================9/9/2026================
        /// //=================================9/9/2026================
        /// //=================================9/9/2026================
        /// //=================================9/9/2026================







    }
}
