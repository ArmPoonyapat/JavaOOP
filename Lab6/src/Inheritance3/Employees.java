package Inheritance3;

public abstract class Employees {
    protected String firstName;
    protected String lastName;
    protected String securityNumber;

    public Employees(String first, String last, String ssn) {
        this.firstName = first;
        this.lastName = last;
        this.securityNumber = ssn;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                firstName, lastName, securityNumber);
    }

    public abstract double earnings();
}