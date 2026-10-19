package oops.Inheritance;

public class ParentClass {

    int i =10;
    static{
        System.out.println("Static block.....");
    }

    {
        System.out.println(" Normal block ");
    }
      ParentClass(){
          System.out.println(" call Parent class contructor....");
      }



}
