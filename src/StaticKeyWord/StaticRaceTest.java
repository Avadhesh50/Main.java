package StaticKeyWord;

import java.util.concurrent.Executors;
import  java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class StaticRaceTest {

    public static AtomicInteger sharedCount = new AtomicInteger(0) ;


    public static void main(String[] args) throws InterruptedException {
        int totalTasks = 10000;
                     ExecutorService execut = Executors.newFixedThreadPool(10);

                     for(int x=1;x<totalTasks;x++){
                         execut.submit(sharedCount :: incrementAndGet);

                     }
                execut.shutdown();
                     execut.awaitTermination(5,TimeUnit.SECONDS);
        System.out.println("Final Counter Value: " + sharedCount.get());

    }

}
