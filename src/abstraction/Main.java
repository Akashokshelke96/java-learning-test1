package abstraction;

public class Main {
    public static void main(String[] args) {
        DebitCard dc = new DebitCard();
        Creditcard cc = new Creditcard();

        System.out.println(getAvailableLimit(dc));
        System.out.println((getAvailableLimit(cc)));
        System.out.println(getSpentLimit(cc));

    }

    private static double getSpentLimit(Creditcard cc) {
        return 30000;
    }

    public static double getAvailableLimit(Card card1) {
        return card1.getTotalLimit() - card1.getSpentLimit();
    }
}

