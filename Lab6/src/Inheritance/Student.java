package Inheritance;

public class Student {
    private int id;
    private String name;
    private double gpa;

    // Constructor 1
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Constructor 2
    public Student(int id, double gpa) {
        this.id = id;
        this.gpa = gpa;
        this.name = "";  // ชื่อว่างถ้าไม่ได้ใส่มา
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Override toString()
    public String toString() {
        return "Student:\nID: " + id + "\nName: " + name + "\nGPA: " + gpa;
    }
}
