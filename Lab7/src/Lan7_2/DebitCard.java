package Lan7_2;

public class DebitCard extends Card {
    private String cardNumber;
    private SavingsAccount account;

    public DebitCard(SavingsAccount account, String cardNumber) {
        this.account = account;
        this.cardNumber = cardNumber;
    }

    @Override
    public String type() {
        return "visa";
    }

    @Override
    public double discount() {
        return 2.5;
    }
    
    @Override
    public boolean withdraw(double amount) {
        return this.account.withdraw(amount);
    }
    
    public String getCardNumber() {
        return this.cardNumber;
    }

    public SavingsAccount getAccount() {
        return this.account;
    }
}