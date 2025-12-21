//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

import java.util.Scanner;

public class ThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        int sum = a + b + c;
        int average = sum / 3;
        int product = a * b * c;

        int smallest, largest;

         if(a <= b && a<=c){
          smallest=a;
         } else if (b<=a  && b<=c){
          smallest=b;
         }else{  
           smallest=c;
          }



        if(a >= b && a>=c){
           largest=a;
        } else if (b>=a  && b>=c){
           largest=b;
         }else{
           largest=c;
         }



        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
   
/*OUTPUT:
Enter first integer: 3
Enter second integer: 4
Enter third integer: 5
Sum: 12
Average: 4
Product: 60
Smallest: 3
Largest: 5
 */