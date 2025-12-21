//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

import java.util.Scanner;
import java.util.Arrays;

class Arrays1{
 public static void main(String[] args) {
   System.out.println("Enter the Size of Array you want to Create");
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] A1 = new int[n];
    System.out.print("Enter the elements");
   for(int i=0 ;i<A1.length;i++){
       A1[i] = sc.nextInt();
     }
   System.out.println("Original Array is:");
      for(int i=0 ;i<A1.length;i++){    
       System.out.println( A1[i]+"," +"\t");
     }
   System.out.println("Array after Sorting is:");
   Arrays.sort(A1);
   System.out.println(Arrays.toString(A1));
 }
}

/*OUTPUT:
Enter the Size of Array you want to Create
5

Enter the elements
55
55
44
333
2

Original Array is:
55,
55,
44,
333,
2

Array after Sorting is:
[2, 44, 55, 55, 333]

*/