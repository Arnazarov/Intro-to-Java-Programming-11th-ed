/*
(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display the future day of the week. 
Here is a sample run:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
*/
import java.util.Scanner;
public class Exercise_03_05
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter today's day: ");
      int today = sc.nextInt();
      System.out.print("Enter the number of days elapsed since today: ");
      int elapsed = sc.nextInt();
      int futureDay = (today + elapsed) % 7;
      
      switch (today)
      {
         case 0: System.out.print("Today is Sunday"); break;
         case 1: System.out.print("Today is Monday"); break; 
         case 2: System.out.print("Today is Tuesday"); break;
         case 3: System.out.print("Today is Wednesday"); break;
         case 4: System.out.print("Today is Thursday"); break;
         case 5: System.out.print("Today is Friday"); break;
         case 6: System.out.print("Today is Saturday");
 
      }
            
      switch (futureDay)
      {
         case 0: System.out.print(" and the future day is Sunday"); break;
         case 1: System.out.print(" and the future day is Monday"); break;
         case 2: System.out.print(" and the future day is Tuesday"); break;
         case 3: System.out.print(" and the future day is Wednesday"); break;
         case 4: System.out.print(" and the future day is Thursday"); break;
         case 5: System.out.print(" and the future day is Friday"); break;
         case 6: System.out.print(" and the future day is Saturday");
      }      
                       
   }
}
