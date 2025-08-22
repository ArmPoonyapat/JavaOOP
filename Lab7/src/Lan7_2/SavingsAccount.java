package Lan7_2;

public class SavingsAccount extends BaseAccount {
    private Card card;
    private double balance;

    public SavingsAccount(FixedSalary employee) {
        this.balance = 0;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    public double getBalance() {
        return this.balance;
    }
}