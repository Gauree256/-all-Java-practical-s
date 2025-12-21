//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

import java.util.Scanner;

public class QuizGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[10]; // Array to store grades
        int total = 0;

        System.out.println("Enter the grades of 10 students (0 to 100):");

        // Input grades for 10 students
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = input.nextInt();

            // Validate input
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.print("Invalid grade. Please enter a value between 0 and 100: ");
                grades[i] = input.nextInt();
            }

            total += grades[i]; // Add to total
        }

        // Calculate average
        double average = total / 10.0;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total of all grades: " + total);
        System.out.printf("Average grade: %.2f\n", average);

        input.close();
    }
}

/*OUTPUT:
Enter the grades of 10 students (0?100):
Enter grade for student 1: 8
Enter grade for student 2: 5
Enter grade for student 3: 2
Enter grade for student 4: 0
Enter grade for student 5: 1
Enter grade for student 6: 5
Enter grade for student 7: 9
Enter grade for student 8: 5
Enter grade for student 9: 2
Enter grade for student 10: 2

Results:
Total of all grades: 39
Average grade: 3.90
*/