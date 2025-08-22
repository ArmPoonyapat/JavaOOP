package Inheritance3;

public class CommissionPay extends Employees {
    private double grossSales;
    private double commissionRate;

    public CommissionPay(String firstName, String lastName, String ssn, double sales, double rate) {
        super(firstName, lastName, ssn);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("commission employee: %s %s\nsocial security number: %s\ngross sales: $%.2f; commission rate: %.2f",
                firstName, lastName, securityNumber, grossSales, commissionRate);
    }
}