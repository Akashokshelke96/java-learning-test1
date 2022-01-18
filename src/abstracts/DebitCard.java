package abstracts;

public class DebitCard implements Card, Expirable{
    @Override
    public double getSpentLimit() {
        return 10000;
    }

    @Override
    public double getTotalLimit() {
        return 50000;
    }

    @Override
    public String getExpiryDate() {
        return "20/12/2020";
    }
}
