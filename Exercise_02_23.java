/*(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip. Here is a sample run:
Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36
*/
import java.util.Scanner;
public class Exercise_02_23
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter distance: ");
      double distance = sc.nextDouble();
      System.out.print("Enter mpg: ");
      double mpg = sc.nextDouble();
      System.out.print("Enter gas price per gallon: ");
      double ppg = sc.nextDouble();
      double cost = distance / mpg * ppg;
      System.out.printf("The cost of driving is $%.2f", cost);
   }
}