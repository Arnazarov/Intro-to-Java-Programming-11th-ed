/*
(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each
column. Here is a sample run:
Enter a 3-by-4 matrix row by row:
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum of the elements at column 0 is 16.5
Sum of the elements at column 1 is 9.0
Sum of the elements at column 2 is 13.0
Sum of the elements at column 3 is 13.0
*/
import java.util.Scanner;
public class Exercise_08_01
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a 3-by-4 matrix row by row: ");
       double[][] m = new double[3][4];
       for (int row = 0; row < 3; row++)
       {
         for (int col = 0; col < 4; col++)
         {
            m[row][col] = sc.nextDouble();
         }
       }
       System.out.print("Column number: ");
       int n = sc.nextInt();
       System.out.printf("Sum of the elements at column %d is %.1f",n, sumColumn(m,n));
   }
   
   public static double sumColumn(double[][] m, int columnIndex)
   {

      double result = 0;
      
         for (int row = 0; row < 3; row++)
         {
            result += m[row][columnIndex];    
         }
      
      return result;
   
   
   }
}
