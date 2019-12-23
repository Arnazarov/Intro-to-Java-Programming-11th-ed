/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total. Here is a sample run:
*/
import java.util.Scanner;
public class Exercise_02_05
{
   public static void main(String[] args)
   {
      double subtotal, gratuity;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the subtotl and a gratuity rate: ");
      subtotal = sc.nextDouble();
      gratuity = sc.nextDouble();
      double tip = subtotal*gratuity/100;
      double total = subtotal + tip;
      System.out.print("The gratutity is $" + tip +
                     " and total is $" + total);
      
      
   }
}