
public class BankProject{
    public static void main(String[] args) {
        var myAccount= new Savings();

        System.out.println(" welcome to CBE Bank ");
        myAccount.deposit(100);
        myAccount.addBonus();
        myAccount.withdraw(20);
        myAccount.show();
    }
}

class Account {
    private double currentbalance = 0;

    public void deposit(double amount) {
        currentbalance += amount;
        System.out.println("successfully added $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= currentbalance) {
            currentbalance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void show() {
        System.out.println("Total Account Balance: $" + currentbalance);
    }
}

class Savings extends Account {
    public void addBonus() {
        deposit(10);
        System.out.println("Bonus applied: $10");
    }
}