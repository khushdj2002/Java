package abhijith;

public class PredatoryCreditCard extends CreditCard{
    private double apr;

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance,double apr) {
        super(customer, bank, account, limit, balance);
        this.apr=apr;
    }

    @Override
    public boolean charge(double price) {
    boolean isSuccess = super.charge(price);
    if (!isSuccess)
        balance=balance+5;
    return isSuccess;
    }
    public void processMonth(){
        if(balance>0){
            double monthlyFactor=Math.pow(1+apr,1.0/12);
            balance=balance*monthlyFactor;
        }
    }

    public static void main(String[] args) {
        PredatoryCreditCard pd = new PredatoryCreditCard("Kushal","SBI","SAving",10000,300000,2.0);
       // CreditCard card = new PredatoryCreditCard("cus","bank","saving",50000,50.00,3.00);
       // CreditCard hel = new CreditCard();
        System.out.println(pd.charge(500));
        System.out.println(pd.getBalance());
        pd.processMonth();
        System.out.println(pd.getBalance());
    }
}
