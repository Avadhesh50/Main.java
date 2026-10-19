package DailyQuestion;
import Java8.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;

public class TestEmployeeData {
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


        List<String>  strList  = Arrays.asList("Helo", "mohan","Rahul", "Amit", "John", "Deepak");
        List<Integer> intlist =   Arrays.asList(20,7,9,4,6,2,78,58,100,3,65,5,2,74,9,8,7,15);

        //// Arrays.stream(arr)  -- > arrays convert in  IntStream0
        //// Convert array to IntStream using Arrays.stream()-----------------


//-----------------------------------sort Test-----
        strList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
       //Sort Employees by salary in ascending order using
       //employees.stream().sorted(Comparator.comparingDouble(Employee :: getSalary)).forEach(System.out::println);
//        Java 8 Sorting Coding Questions

//        1. Sort a List<Integer> in ascending order using sorted().

        //intlist.stream().sorted().forEach(System.out::println);
//        2. Sort a List<String> alphabetically using sorted().

        //strList.stream().sorted().forEach(System.out:: println);
//        3. Sort Employees by salary in ascending order using Comparator.comparing().

        //employees.stream().sorted(Comparator.comparingDouble(Employee :: getSalary)).forEach(System.out::println);

//        4. Sort Employees by salary in descending order using Comparator.comparing().reversed().
          //  employees.stream().sorted(Comparator.comparingDouble(Employee ::getSalary).reversed()).forEach(System.out::println);
//        5. Sort Employees by age in ascending order.
            //employees.stream().sorted(Comparator.comparingInt(Employee :: getAge)).forEach(System.out::println);
//        6. Sort Employees by name alphabetically.
          //employees.stream().sorted(Comparator.comparing(Employee :: getName)). forEach(System.out :: println);
//        7. Sort Employees by salary, and if salary is same, sort by name using thenComparing().
            //    employees.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).thenComparing(Employee::getName)).forEach(System.out :: println);

//        8. Sort Employees by salary descending, and if salary is same, sort by age ascending.
                employees.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed().thenComparing(Employee :: getName)).forEach(System.out::println);
//        9. Find the second-highest salary from an Employee list using Java 8 Streams.
                Optional<Employee> ad =  employees.stream().sorted(Comparator.comparingDouble(Employee :: getSalary)).skip(2).limit(1).findFirst();
//        10. Find the top 3 highest-paid employees using Java 8 Streams.


//        11. Sort Employees by department ascending, salary descending, and name ascending.


//        12. Sort Employees by multiple fields using Comparator.comparing() and thenComparing().
//
//        13. Sort a List<Double> in descending order using Java 8 Streams.
//
//        14. Sort Strings by length in ascending order using Comparator.comparing().
//
//        15. Sort Strings by length in descending order using Comparator.comparing().reversed().
//
//        16. Sort Employees by salary without modifying the original List.
//
//        17. Find the employee with the highest salary using max().
//
//        18. Find the employee with the second-highest salary using sorted(), distinct(), skip(), and findFirst().
//
//        19. Sort Employees by name ignoring case.
//
//        20. Sort Employees by salary, handling duplicate salaries.
//
 /// / ---28/09/2026
//        1. Salary > 1 lakh employees
    List<Employee> result1 =   employees.stream().filter(f-> f.getSalary() > 90000).collect(Collectors.toList());

//        2. Highest salary
       Employee result2 =  employees.stream().max(Comparator.comparingDouble(Employee :: getSalary)).orElse(null);

//        3. Second highest salary
       Employee result3 = employees.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed()).skip(1).findFirst().get();
//        4. Lowest salary
        Employee result4 = employees.stream().min(Comparator.comparingDouble(Employee :: getSalary)).orElse(null);
//        5. Department-wise employee count
        Map<String, Long> result5 = employees.stream().collect(Collectors.groupingBy(Employee ::getDepartment,
                Collectors.counting()));
//        6. Department-wise highest salary
        Map<String,Optional<Employee>> result6 = employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors
                .maxBy(Comparator.comparingDouble( Employee :: getSalary))));
//        7. Salary ascending sort
        List<Employee> result7 = employees.stream().sorted(Comparator.comparingDouble(Employee :: getSalary)).toList();
//        8. Names ki list

        List<String> result8 = employees.stream().map(Employee :: getName).collect(Collectors.toList());
//        9. Average salary
        Double result9 = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//        10. Duplicate salaries
       Set<Double> result10 =  employees.stream().collect(Collectors.groupingBy(Employee :: getSalary,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        /// ==================================== ---30/09/2026-----------------------------------------------------------------------------

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

        Map<Integer,Long> r1=  Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        /// / <=====second
        int[] arr1 = {10, 5, 20, 8, 20, 15, 10};
      Integer r2 =  Arrays.stream(arr1).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//🔧 One improvement
//
//Avoid .get() on Optional in production/interview code because it can throw NoSuchElementException if there is no second distinct element.

    String str = "java is easy and java is powerful";
        //Find the frequency of each word.
    //\\s+ handles one or more whitespace characters.
        Map<String,Long> r3 =
                Arrays.stream(str.split(" \\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        str.chars().mapToObj(m->(char)m)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character, Long> result =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));

        Character firstNonRepeating =
                result.entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);
/// /=------------------------------------------
        int[] arr30  = {1, 2, 2, 2, 3, 1, 1};
        Set<Integer> st = new HashSet<>();
       List<Integer>  r30  =  Arrays.stream(arr30).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .entrySet()
                       .stream()
                               .filter(f -> f.getValue()>1)
                                       .map(Map.Entry :: getKey)
                                               .toList();


/// /=------------------------------------------Reverse each word, but keep the word order the same.

  String r306 =  Arrays.stream(str.split(" ")).map(m -> new StringBuilder(m).reverse().toString()).collect(Collectors.joining(" "));

        /// ==================================== ---01/10/2026-----------------------------------------------------------------------------
        int[] arr101 = {4, 2, 2, 8, 3, 3, 3, 1, 4};



        Integer  result101 = Arrays.stream(arr101).boxed().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new,
                        Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry :: getKey).orElse(null);



        /// ==================================== ---02/10/2026-----------------------------------------------------------------------------



       int[] arr210 = {2, 7,11, 15};
        int target = 9;
//
//        Find two numbers whose sum equals the target.
//
//        Expected output:
//
//[2, 7]
        int []result210 = new int[2];
        for (int  x=0;x<arr210.length;x++){
            for(int y= x+1;x<arr210.length;x++){

                if(arr210[x]+arr210[y] == target){
                    result210[0] += arr210[x];
                    result210[1] += arr210[y];

                }
            }

        }
        System.out.print(Arrays.toString(result210));
   ///  Hash Map User
       Set<Integer> set = new HashSet<>();
       for(int currentNumber : arr210){
           int findNum = target - currentNumber;
           if(set.contains(findNum)){
               System.out.println(findNum+","+currentNumber);
               break;
           }
           set.add(currentNumber);
       }


 // employees.stream().filter(f  ->f.getAge() > 30 &&f.getSalary()<70000).forEach(System.out :: println);
        List<String> emplist = employees.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).map(m-> m.getName()).toList();
        Employee employee = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
        Map<String,Long> result12 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        /// /=------------------------------------------
        String str1011 = "aabbbccccddddd";

        Character ch = str1011.chars()
                .mapToObj(m -> (char)m)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap  :: new,Collectors.counting()))
                        .entrySet()
                                .stream()
                                        .sorted(Map.Entry.<Character,Long>comparingByValue().reversed().thenComparing(e -> str.indexOf(e.getKey())))
                                                .skip(2)
                                                        .map(Map.Entry :: getKey)
                                                                .findFirst()
                                                                        .orElse(null);

// /=------------------------------------------
       // First 3 even numbers ke squares
        List<Integer> nums =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      List<Integer> res1011 =  nums.stream().filter(f -> f%2==0).limit(3).map(m -> m*m).toList();


/// /=------------------------------------------


       Map<String, Optional<Employee>> result1011 = employees.stream()
                                                    .collect(Collectors.groupingBy(Employee :: getDepartment,
                                               Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary))));


       for(Map.Entry<String,Optional<Employee>> rr: result1011.entrySet()){

           System.out.println(rr.getKey() +"->"+ rr.getKey()+" "+rr.getValue());
       }
                                           System.out.println(result1011);


/// /=------------------------------------------

        Map<String,Double> result123 =  employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.averagingDouble(Employee :: getSalary)));
        for(Map.Entry<String,Double> dd : result123.entrySet()){
            System.out.println(dd.getKey()+" -> "+dd.getValue());
        }

/// /=------------------------------------------

     Map<String,Optional<Employee>> result456 =    employees.stream()
                                                    .collect(Collectors.groupingBy(Employee :: getDepartment,
                                                            Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary))));
        for(Map.Entry<String,Optional<Employee>> ee1 : result456.entrySet()){
     ee1.getValue().ifPresent( empl -> System.out.println(

             ee1.getKey()+" -> "+empl.getName()+" ("+empl.getSalary()+")"
     )
     );

        }
/// /=------------------------------------------


                String str123 = "Hello! My Name is Avadesh123.". toLowerCase();

                // Define the specific characters you want to count
                Set<Character> targetChars = Set.of('a', 's', 'e', '1');

                Map<Character, Long> result123456 = str123.chars()
                        .mapToObj(m -> (char) m)
                        // Filter to keep only the required characters
                        .filter(targetChars :: contains)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));

                System.out.println("Character counts: " + result123456);


////=------------------------------------------
        List<Integer> salaries =
                Arrays.asList(80000, 60000, 100000, 75000, 100000, 90000, 80000);

        Integer res = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(3)
                .findFirst()
                .orElse(null);





/// /=------------------------------------------
  // largest number


     Map<String,Double> r11 = employees.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.collectingAndThen(Collectors.toList()
             , data -> data.stream()
                     .distinct()
                     .map(Employee::getSalary)
                     .sorted(Comparator.reverseOrder())
                     .skip(1)
                     .findFirst()
                     .orElse(null)

     )));





/// /=------------------------------------------
/// /=------------------------------------------
/// /=------------------------------------------
/// /=------------------------------------------
        System.out.println("Character counts: " + r11);
/// /=------------------------------------------


    }


}
