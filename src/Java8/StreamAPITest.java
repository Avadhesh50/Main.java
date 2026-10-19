package Java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPITest {
    public static void main(String [] args){

     int []arr ={152,1,6,4,57,9,5,4,10,4,4,5,75,4,2,3,5,};
     List<Integer>  intlist = Arrays.asList(152,1,6,4,57,9,5,4,10,4,4,5,75,4,2,3,5,12);

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

     String []strarr = {"Helo", "mohan","Rahul", "Amit", "John", "Deepak"};
     boolean []booarr ={true,false};
     String Str =  "Hello Avadhesh Kumar Yadav";
       //---------------------------------------max(),min(),avg(),sum()------------------------------------------

        System.out.println( Math.max(12,20));
        Arrays.stream(arr).max().isEmpty();

       //---------------------------------Sorted() Test----------------------------------------------------

        //  Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //intlist.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
       // Arrays.stream(strarr).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Arrays.asList(strarr).stream().sorted()


    }

}
