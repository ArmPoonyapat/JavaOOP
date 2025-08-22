package Inheritance;

public class Undergrad extends Student {
    private String year;

    public Undergrad(int id, String name, double gpa, String year) {
        super(id, name, gpa); // เรียก constructor ของ Student
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Undergraduate Student:\nID: " + getId() +
               "\nName: " + getName() +
               "\nGPA: " + getGPA() +
               "\nYear: " + year;
    }
}
