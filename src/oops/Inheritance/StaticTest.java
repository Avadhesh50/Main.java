package oops.Inheritance;

import jdk.dynalink.beans.StaticClass;

public class StaticTest {
    static String str ="Avadhesh share all object";
    static int counter =0;
    StaticTest(){
        counter++;
        System.out.println("print the counter value"+ counter);
    }
static{
    System.out.println(" Printing the static block");
}
    public static void main(String[] args) {

        System.out.println(new StaticTest());
                            new StaticTest();
                            new StaticTest();


        System.out.println(StaticTest.str);
    }



}
