//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 3000.0);
        Employee emp2 = new Employee("Jane", "Smith", 4000.0);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                           " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                           " Yearly Salary: " + emp2.getYearlySalary());


emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                           " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                           " Yearly Salary: " + emp2.getYearlySalary());
    }
}

/*OUTPUT:
John Doe Yearly Salary: 36000.0
Jane Smith Yearly Salary: 48000.0

After 10% Raise:
John Doe Yearly Salary: 39600.0
Jane Smith Yearly Salary: 52800.0 
*/