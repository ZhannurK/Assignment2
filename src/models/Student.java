package models;

public class Student  extends Person {
    private static int id_gen;
    private double gpa;

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student " + getId() + ": " + getName() + " " + getSurname();
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }
}