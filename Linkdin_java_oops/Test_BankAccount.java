public class Test_BankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Kushal",30000);

        System.out.println(b1.getOwner());
        System.out.println(b1.getBalance());

        b1.Deposit(20000);
        System.out.println(b1.getBalance());
        b1.Withdraw(10000);
        System.out.println(b1.getBalance());

    }
}
