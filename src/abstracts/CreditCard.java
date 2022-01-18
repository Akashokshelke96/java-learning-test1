package abstracts;

public class CreditCard implements Card, Expirable {
    @Override
    public double getSpentLimit() {
        return 75000;
    }

    @Override
    public double getTotalLimit() {
        return 8000000;
    }

    @Override
    public String getExpiryDate() {
        return "25/11/1922";
    }
}
