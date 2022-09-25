public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner,double balance){
        this.owner=owner;
        this.balance=balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public  void setBalance(double balance){
        this.balance=balance;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }

    public double Withdraw(double withdraw){
       if (withdraw<=balance) {
           balance = balance - withdraw;
           return balance;
       }
       else
           return 0;
    }
    public  double Deposit(double deposit){

        balance=balance+deposit;
        return balance;
    }

}
