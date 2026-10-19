package Java8.StreamAPI;

import Java8.Employee;
import Java8.Person;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class TestMaxMinSumAvg {

    public static void main (String [] args){
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

        List<Person> people = List.of(
                new Person("Tom", 34),
                new Person("Jerry", 29),
                new Person("Spike", 41)
        );

        int  arr[] = {21,52,10,60,50,8,20};


         int no[] = {};
        //// Arrays.stream(arr)  -- > arrays convert in  IntStream
        //// Convert array to IntStream using Arrays.stream()
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int sum = Arrays.stream(arr).sum();
          Arrays.stream(arr).summaryStatistics().getMin();


        double db = Arrays.stream(arr).average().getAsDouble();
        int no1 = Arrays.stream(no).max().orElse(-1);
        System.out.println(no1);
        System.out.println(Arrays.toString(arr));

        // filter
        int []  even =   Arrays.stream(arr).filter(f -> f%2==0).toArray();
        System.out.println(even);

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        //--step1
         int  a=20; int c=40; int b= 60;
        numbers.stream().mapToInt(Integer :: intValue).max().getAsInt();
                Stream.of(a,b,c).mapToInt(Integer :: intValue).summaryStatistics().getMax();  //max(Integer ::compare).orElseThrow();
         numbers.stream().collect(Collectors.summarizingInt(Integer :: intValue)).getMin();
               double dd = employees.stream().collect(Collectors.summarizingDouble(Employee :: getSalary)).getMax();
         Arrays.stream(arr).summaryStatistics().getMin();

        int  mx = numbers.stream()
                        .mapToInt(Integer :: intValue)
                                .max().getAsInt();
        System.out.println(mx);

        //Count strings starting with a specific prefix, e.g., “A”.
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie","aVADHESH");
        List<Integer> ll = List.of(12,18,16,13,12,10,12,50);
        Integer i = ll.stream().min(Integer::compare).orElseThrow();

        names.stream().filter(f -> f.startsWith("")).count();
//
//        Count strings starting with a letter — Count how many names in a list start with "A" (case-insensitive).
        long co = names.stream().filter(f -> f.startsWith("a")).count();
//        Find the maximum number — Find the maximum value in a list of integers using Stream.max().
         int co1 = numbers.stream().max(Integer :: compare).orElseThrow();
                  int co3 = numbers.stream().mapToInt(Integer :: intValue).max().getAsInt();
        System.out.println(co3);

//                Find the minimum salary — Given a list of employees, find the one with the lowest salary.
       Double minS =  employees.stream().mapToDouble(Employee :: getSalary).min().getAsDouble();

//        Sum of even numbers — Calculate the sum of all even numbers in a list.
          long data5 =  ll.stream().filter(f -> f%2==0).mapToInt(n -> n).summaryStatistics().getSum();
        System.out.println(data5);

//        Count words longer than N characters — Count how many words have length greater than 5.


//        Sum of employee salaries by department — Group employees by department and calculate total salary per department.
        Map<String, DoubleSummaryStatistics> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summarizingDouble(Employee::getSalary)));
        System.out.println(collect);
//
//        Find the oldest person — Given a list of people with ages, find the oldest one.
        int string = people.stream().mapToInt(Person::getAge).max().getAsInt();
        System.out.println(string);


//                Count distinct elements — Count how many distinct values exist in a list with duplicates.
//                Sum of squares — Calculate the sum of squares of all numbers in a list.
//                Find min, max, sum, count in one pass — Use IntSummaryStatistics to get all of these together.





        System.out.println();

    }
}
