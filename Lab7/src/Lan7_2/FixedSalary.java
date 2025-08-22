package Lan7_2;

public class FixedSalary {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double monthlySalary;
    private DebitCard card;
    private SavingsAccount account;

    public FixedSalary(String firstName, String lastName, String socialSecurityNumber, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
        this.account = new SavingsAccount(this);
        this.card = new DebitCard(this.account, "xxx-xxx-5555");
    }

    public DebitCard getCard() {
        return this.card;
    }
}
