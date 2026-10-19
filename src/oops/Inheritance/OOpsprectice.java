package oops.Inheritance;


public class OOpsprectice {

    public static void main(String []args){


        Customer regularCustomer = new Customer("Geek1", "123 Main St",
                "123-456-7890");
        regularCustomer.displayCustomerInfo();
        double regularPrice = 1000.00;
        System.out.println("Price for Regular Customer: $"
                + regularCustomer.calculatePrice(regularPrice));

        // Create a VIPCustomer object
        VIPcustomar vipCustomer = new VIPcustomar("Geek2", "456 Elm St",
                "987-654-3210", 20.0);
        System.out.println("\nVIP Customer Info:");
        vipCustomer.displayVIPCustomerInfo();
        double vipPrice = 2000.00;



    }
}

 class Customer{

    String name;
    String address;
    String phone;


    public Customer(String name,String address, String phone){

        this.name = name;
        this.address = address;
        this.phone = phone;

    }
    public void displayCustomerInfo(){


        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Phone : "+phone);


    }
    //Reguler customer for no discount
    public double calculatePrice(double price){

        return price;
    }




}

class VIPcustomar extends Customer{

    private double discountRate;

    public VIPcustomar(String name, String address, String phone,double discountPrice) {
        super(name, address, phone);
        this.discountRate = discountRate;
    }

    @Override
    public double calculatePrice(double price){
        double discount = price * (discountRate / 100);
        return discount;
    }


    public void displayVIPCustomerInfo(){
        displayCustomerInfo();
        System.out.println("VIP Discount Rate: "
                + discountRate + "%");


    }

}




