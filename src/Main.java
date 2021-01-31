public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        CheckingAccount account1 = new CheckingAccount();
        CreditAccount account2 = new CreditAccount();

        account1.transfer(account, 500);
        account.addMoney(1);

        account2.transfer(account2, 600);

        account2.addMoney(1000);
        account2.addMoney(-1);

        account.transfer(account2,1000);

        account2.pay(500);
    }
}