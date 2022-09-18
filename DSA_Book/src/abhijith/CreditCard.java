package abhijith;

public class CreditCard {
    private String customer;

    private String bank;
    private int limit;
    private String account;
    protected double balance;
    public CreditCard(String customer,String bank,String account,int limit,double balance){
       this.customer=customer;
      //  this.customer=cus;
        this.bank=bank;
        this.account=account;
        this.limit=limit;
        this.balance=balance;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public boolean charge(double price){
        if(price+balance>limit)
            return false;
        balance=balance+price;
        return true;
    }
    public void makePayment(double amount){
        balance=balance-amount;
    }
/*
    public void setBalance(double balance) {
        this.balance = balance;
    }

 */

    public static void main(String[] args) {
        CreditCard cd = new CreditCard("Kushal","SBI","SAVING",50000,100000);
        System.out.println(cd.getBalance());
    //    cd.setBalance(9999999);
        cd.makePayment(500);
        System.out.println(cd.getBalance());
        System.out.println(cd.charge(15000));
        System.out.println(cd.getBalance());
    }
}
