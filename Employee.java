//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public double getMonthlySalary() { return monthlySalary; }
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) this.monthlySalary = monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary = monthlySalary + (monthlySalary * percentage / 100);
        }
    }
}