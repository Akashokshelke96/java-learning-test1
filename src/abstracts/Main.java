package abstracts;

public class Main {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        DebitCard dc = new DebitCard();

        System.out.println(dc.getExpiryDate());
        System.out.println(cc.getExpiryDate());
        System.out.println(cc.getTotalLimit());

    }
}
