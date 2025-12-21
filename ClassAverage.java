//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;        // Sum of all grades
        int gradeCount = 0;   // Number of grades entered

        System.out.println("Enter grades for students (0 to 100).");
        System.out.println("Enter -1 to indicate that you are done.\n");

        // Input loop
        while (true) {
            System.out.print("Enter grade (or -1 to finish): ");
            int grade = input.nextInt();

            // Sentinel value to stop
            if (grade == -1) {
                break;
            }

            // Validate grade range
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                continue;
            }

            total += grade;
            gradeCount++;
        }

        // Check if any grades were entered
        if (gradeCount > 0) {
            double average = (double) total / gradeCount;
            System.out.println("\nTotal of all grades: " + total);
            System.out.printf("Average grade: %.2f\n", average);
        } else {
            System.out.println("\nNo grades were entered.");
        }

        input.close();
    }
}

/*OUTPUT:
Enter grades for students (0 to 100).
Enter -1 to indicate that you are done.

Enter grade (or -1 to finish): 5
Enter grade (or -1 to finish): 44
Enter grade (or -1 to finish): 55
Enter grade (or -1 to finish): 34
Enter grade (or -1 to finish): 423
Invalid grade. Please enter a value between 0 and 100.
Enter grade (or -1 to finish): 33
Enter grade (or -1 to finish): 33
Enter grade (or -1 to finish): 22
Enter grade (or -1 to finish): 1
Enter grade (or -1 to finish): 2
Enter grade (or -1 to finish): -1

Total of all grades: 229
Average grade: 25.44
*/