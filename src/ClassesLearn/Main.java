package ClassesLearn;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Akash", "Shelke", "241 - BakerStreet", "9399403930");
        Customer customer2 = new Customer("Nishu", "Rajoriya","232 - BakerStreet","9494475894" );
        System.out.println(customer1.getDetails());
        System.out.println(customer2.getDetails());
        System.out.println(customer1.getDial());
    }
}

