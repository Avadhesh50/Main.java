package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {

    public static void main(String [] args){

           ExecutorService executor =  Executors.newFixedThreadPool(2);

           for(int x=0;x<5;x++){
          int task = 1;
               executor.execute(() ->  System.out.println("Task"+ task+" is perfarm by "+Thread.currentThread().getName()));
           }
  executor.shutdown();


    }
}
