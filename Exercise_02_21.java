/*
(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and displays the future investment value using the following formula:
futureInvestmentValue =
investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.
Here is a sample run:
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92
*/
import java.util.Scanner;
public class Exercise_02_21
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      double accValue;
      System.out.print("Enter investment amount: ");
      double investment = sc.nextDouble();
      System.out.print("Enter APR: ");
      double interest = sc.nextDouble();
      System.out.print("Enter number of years: ");
      double years = sc.nextDouble();
      
      double monthlyIR = interest/1200;
      accValue = investment*Math.pow((1 + monthlyIR), years*12);
      System.out.printf("Accumulated value is $%.2f", accValue); 
   }
}