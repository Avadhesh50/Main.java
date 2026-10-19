package Java8;

public class StDefTest {

    public static void main(String[] args) {

        Vechicles bike = new Bike();
        bike.horn();
        bike.shareFunc();

        Vechicles car = new Car();
        car.horn();
        car.shareFunc();

         Vechicles.class.getName();//comanp();
    }



}
