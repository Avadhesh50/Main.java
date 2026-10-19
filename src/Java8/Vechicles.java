package Java8;

public interface Vechicles {

    void horn();

    default void shareFunc(){
        System.out.println("Share the comman functnality to alll....................\n ");
    }

    static void comanp(){
        System.out.println("Share the comman property to all intance ");
    }

}
