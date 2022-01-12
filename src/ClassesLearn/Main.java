package ClassesLearn;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Akash", "Shelke", "241 - BakerStreet", "9399403930");
        Customer customer2 = new Customer("Nishu", "Rajoriya","232 - BakerStreet","9494475894" );
//        System.out.println(customer1.getDetails());
//        System.out.println(customer2.getDetails());
//        System.out.println(customer1.getDial());
        Car tata = new Car("BMW","SSW",2019 );
        System.out.println(tata.getPrice());
        Car AstonMartin = new Car("AstonMartin","SSR",2020);
        System.out.println(AstonMartin.getPrice());
    }
}

