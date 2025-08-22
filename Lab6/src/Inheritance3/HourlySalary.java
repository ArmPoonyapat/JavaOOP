package Inheritance3;

public class HourlySalary extends Employees {
    private double hourlyPay;
    private double hoursWorked;

    public HourlySalary(String firstName, String lastName, String ssn, double pay, double hours) {
        super(firstName, lastName, ssn);
        this.hourlyPay = pay;
        this.hoursWorked = hours;
    }

    @Override
    public double earnings() {
        return hourlyPay * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s %s\nsocial security number: %s\nhourly pay: $ %.2f; hours worked: %.2f",
                firstName, lastName, securityNumber, hourlyPay, hoursWorked);
    }
}