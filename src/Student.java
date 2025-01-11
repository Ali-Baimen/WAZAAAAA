public class Student extends Person implements Payable{
    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public Student(double gpa) {
        this.gpa = 0.0;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if(gpa > 2.67) {
            return 36660.00;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Student" + super.toString();
    }

}