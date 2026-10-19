package Java8;

public class Car implements Vechicles{
    @Override
    public void horn() {

        System.out.println("Car is Horn .... Po....Po......");

    }

    @Override
    public void shareFunc() {
        System.out.println(" Car Default method is running ");
    }
}
