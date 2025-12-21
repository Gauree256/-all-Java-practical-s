//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

import java.util.Scanner;

public class AccountTest
{

   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
     Account account1 = new Account( 50.00 );
     Account account2 =new Account(-7.53 );
     
     double depositAmount; 
 
     System.out.print( "Enter deposit amunt for account1:" );
     depositAmount = input.nextDouble();
     System.out.printf( "\n Adding %.2f to account1 balance\n\n",depositAmount );
   //21  account1.credit(depositAmount);

     System.out.printf( "acccount1 balance: $%.2f\n", account1.getBalance() );
     System.out.printf( "acccount2 balance: $%.2f\n\n",account2.getBalance() );

      System.out.print("Enter deposit amunt for account2:");
     depositAmount = input.nextDouble();
     System.out.printf( "\nAdding %.2f to account2 balance\n\n",depositAmount );
    //29 account2.credit( depositAmount );

     System.out.printf( "acccount1 balance: $%.2f\n", account1.getBalance() );
     System.out.printf( "acccount2 balance: $%.2f\n",account2.getBalance() );
     input.close();
   }
}

/*OUTPUT:
Enter deposit amunt for account1:25.53

 Adding 25.53 to account1 balance

acccount1 balance: $50.00
acccount2 balance: $0.00

Enter deposit amunt for account2:123.45

Adding 123.45 to account2 balance

acccount1 balance: $50.00
acccount2 balance: $0.00 
*/


     
