package abstraction;

public class Creditcard implements Card {

    @Override
    public double getTotalLimit() {
        return 50000;
    }

    @Override
    public double getSpentLimit() {
        return 4000;
    }
    private int cvv;
    private String cardno;
    public Creditcard() {
        this.cardno = cardno;
        this.cvv = cvv;
    }
    public String getCardno() {
        return cardno;

    }

}
