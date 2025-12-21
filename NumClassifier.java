//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

import java.util.Scanner;

public class NumClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
         System.out.println("enter the num.");

        // Loop to read five numbers
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Display results
        System.out.println("\nNumber of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}

/*OUTPUT:
enter the num.
Enter number 1: 7
Enter number 2: -5
Enter number 3: 0
Enter number 4: 2
Enter number 5: 6

Number of positive numbers: 3
Number of negative numbers: 1
Number of zeros: 1
*/