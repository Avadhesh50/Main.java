package StringQuiz;

import java.lang.String;
import java.lang.StringBuffer;
public class StrQuizCOTD {
            public static void main(String [] arge){

                //18
                String st1 ="Hello";
                st1.concat("one");
                st1.concat("two");


     StringBuffer sb = new StringBuffer();
     String strtt = new String();

                System.out.println();

                System.out.println(st1);
                    "ABCD1234".chars().mapToObj(m->(char)m).forEach(System.out::println);
                String str = "Java Concept Of The Day";
                System.out.println(str.indexOf('a', 5));

                System.out.println(str.indexOf('a') + str.indexOf("Day"));

            }
}
