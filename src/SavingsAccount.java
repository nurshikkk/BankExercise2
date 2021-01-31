public class SavingsAccount extends Account {
    int balance = 999;
    @Override
    public void transfer(Account account, int amount) {
        if (balance < 0) {
            System.out.println("Transfer error...");
        } else if (amount < 0) {
            System.out.println("Transfer error...");
        } else if (balance < amount) {
            System.out.println("Transfer error...");
        } else {
            balance = balance - amount;
            System.out.println(amount + "$ successfully transferred");
            System.out.println("Your balance:" + " " + balance);
        }
    }

    @Override
    public void addMoney(int amount) {
        if (amount < 0) {
            System.out.println(amount + "$ hasn't been added to your account");
        } else if (balance < 0) {
            System.out.println(amount + "$ hasn't been added to your account");
        } else {
            balance = balance + amount;
            System.out.println(amount + "$ added to your account");
            System.out.println("Your balance:" + " " + balance);
        }
    }
}