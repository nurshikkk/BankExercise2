public class CreditAccount extends Account {
    int balance1 = -999;
    @Override
    public void pay(int amount) {
        if (amount < 0) {
            System.out.println("Payment Error...");
        } else if (balance1 > 0) {
            System.out.println("Payment Error...");
        } else {
            balance1 = balance1 - amount;
            System.out.println(amount + "$ was debited from the account");
            System.out.println("Your balance:" + " " + balance1);
        }
    }

    @Override
    public void addMoney(int amount) {
        if (amount < 0) {
            System.out.println(amount + "$ hasn't been added to your account");
        } else if (balance1 >= 0) {
            System.out.println(amount + "$ hasn't been added to your account");
        } else if (amount > -(balance1)) {
            int overpayment = balance1 + amount;
            balance1 = 0;
            System.out.println("You have been overpaid your credit balance" +
                    "\n" + "Your overpaid balance:" + " " + overpayment +
                    "\n" + "Your balance:" + " " + balance1);
        } else {
            balance1 = balance1 + amount;
            System.out.println(amount + "$ added to your account");
            System.out.println("Your balance:" + " " + balance1);
        }
    }
}