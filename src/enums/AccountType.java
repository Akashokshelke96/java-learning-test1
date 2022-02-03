package enums;

public enum AccountType {
    savingsAccount(15000,1),
    currentAccount(10000,1),
    jointAccount(122222,2);

  private double minBalance;

    private int noOfOwners;


  AccountType(double minB, int owners){
   this.minBalance = minB;
    this.noOfOwners = owners;

}


    double getMinBalance() {
        return minBalance;
    }
    public int getNoOfOwners() {
        return noOfOwners;
    }
}

