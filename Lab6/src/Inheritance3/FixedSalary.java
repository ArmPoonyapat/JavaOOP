package Inheritance3;

public class FixedSalary extends Employees {
    private double monthlySalary;

    public FixedSalary(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);
        this.monthlySalary = salary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("Fixed salary employee: %s %s\nsocial security number: %s\nmonthly salary: $%.2f",
                firstName, lastName, securityNumber, monthlySalary);
    }
}