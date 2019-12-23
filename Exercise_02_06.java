/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:
Enter a number between 0 and 1000: 999
The sum of the digits is 27
*/
import java.util.Scanner;
public class Exercise_02_06
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int sum, n;
      do{
      System.out.print("Enter a number between 0 and 1000: ");
      n = sc.nextInt();
      
      } while(n >= 1000 || n <= 0);
      
      sum = n/100%10 +  n/10%10 + n%10;
      System.out.print("The sum of the digits is: " + sum);      
   }
}