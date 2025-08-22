package Inheritance;

public class Graduate extends Student {
    private String thesisTitle;

    public Graduate(int id, String name, double gpa, String thesisTitle) {
        super(id, name, gpa); // เรียก constructor ของ Student
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return "Graduate Student:\nID: " + getId() +
               "\nName: " + getName() +
               "\nGPA: " + getGPA() +
               "\nThesis: " + thesisTitle;
    }
}
