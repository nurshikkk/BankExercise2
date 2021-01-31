public class CheckingAccount extends Account {
    int balance2 = 999;
    @Override
    public void pay(int amount) {
        if (amount < 0) {
            System.out.println("Payment Error...");
        } else if (balance2 < 0) {
            System.out.println("Payment Error...");
        } else if (balance2 < amount) {
            System.out.println("Payment Error...");
        } else {
            balance2 = balance2 - amount;
            System.out.println(amount + "$ was debited from the account");
            System.out.println("Your balance:" + " " + balance2);
        }
    }

    @Override
    public void addMoney(int amount) {
        if (amount < 0) {
            System.out.println(amount + "$ hasn't been added to your account");
        } else if (balance2 < 0) {
            System.out.println(amount + "$ hasn't been added to your account");
        } else {
            balance2 = balance2 + amount;
            System.out.println(amount + "$ added to your account");
            System.out.println("Your balance:" + " " + balance2);
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance2 < 0) {
            System.out.println("Transfer error...");
        } else if (amount < 0) {
            System.out.println("Transfer error...");
        } else if (balance2 < amount) {
            System.out.println("Transfer error...");
        } else {
            balance2 = balance2 - amount;
            System.out.println(amount + "$ successfully transferred");
            System.out.println("Your balance:" + " " + balance2);
        }
    }
}