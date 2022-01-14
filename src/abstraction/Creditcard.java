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
}
