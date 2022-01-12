package ClassesLearn;

public class Customer {
    String firstName;
    String lastName;
    String address;
    double accountBal;
    String dial;

    public Customer(String fName, String lName , String addr , String phone) {//this is a constructor
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.dial = phone;


    }

    public String getDial() {
        return dial;
    }
    public double getAccount() {
        return accountBal;
    }
    public String getDetails() {
        return firstName + " " + lastName + " -"  + address + " -" + dial;


    }
}

