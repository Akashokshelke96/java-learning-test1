package abstracts;

public class Main {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        DebitCard dc = new DebitCard();

        System.out.println(dc.getExpiryDate());
        System.out.println(cc.getExpiryDate());
        System.out.println(cc.getTotalLimit());
        System.out.println(getAvailableLimit(dc));

    }


    public static double getAvailableLimit(Card card) {
    return card.getTotalLimit() - card.getSpentLimit();
    }
}

//main class