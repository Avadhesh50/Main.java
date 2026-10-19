package oops.Inheritance;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainTest {
    public static void main(String[] args) {

       // ParentClass pc = new ParentClass();

        String str2="Hello";
        String str1 ="Hello Avadhesh Kumar Yadav Upcomming the data from data base ";

        Map<Character,Long> data2 = str1.chars().mapToObj(m -> (char)m).filter(f -> !Character.isWhitespace(f)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(data2);


        String str3 = str1+str2;
        System.out.println(str1==str2);
        System.out.println(str3 == str1);


        String  str = new StringBuilder(str1).reverse().toString();
        System.out.println(" ---- for using Builder class"+ str);
        String result = "";
        for(int i = str1.length()-1;i >=0;i--){
            result+=  str1.charAt(i);

        }
        System.out.println(result);

   String sa = IntStream.range(0, str1.length()).mapToObj(i -> String.valueOf(str1.charAt(str1.length()-1 -i))).collect(Collectors.joining());


   System.out.println("Commig the data from Stream methods usoing -------"+sa);


      String data =   IntStream.range(0, str1.length()).mapToObj(m -> String.valueOf(str1.charAt(str1.length()-1 - m))).collect(Collectors.joining());






       // System.out.println("Comming through thredata  ....... "+data);
    }
}
