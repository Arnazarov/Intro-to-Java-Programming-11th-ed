/*
(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
*/
/*
smallest = Math.min(Math.min(a, b), c);
largest = Math.max(Math.max(a, b), c);
middle = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
*/
import java.util.Scanner;
public class Exercise_03_08
{
   public static void main(String[] args)
   {
      int temp = 0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 3 numbers: ");
      int number1 = sc.nextInt();
      int number2 = sc.nextInt();
      int number3 = sc.nextInt();
      
      if (number3 < number1 || number2 < number1)
      {
         if (number3 < number1)
         {
            temp = number3;
            number3 = number1;
            number1 = temp;
         }
         if (number2 < number1)
         {
            temp = number2;
            number2 = number1;
            number1 = temp;
         }
      }
      if (number3 < number2)
      {
         temp = number3;
         number3 = number2;
         number2 = temp;   
      }
      
      System.out.print("Entered number in non-decreasing order: " + number1 + " " + number2 + " " + number3);
   }
}