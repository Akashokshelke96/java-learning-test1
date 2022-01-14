package abstraction;

public class DebitCard implements Card {

    @Override
    public double getTotalLimit() {
        return 100000;
    }

    @Override
    public double getSpentLimit() {
        return 50000;
    }
}
