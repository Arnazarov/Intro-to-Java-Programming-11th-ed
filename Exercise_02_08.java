/*(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so that it prompts the user to enter
the time zone offset to GMT and displays the time in the specified time zone. Here
is a sample run:
Enter the time zone offset to GMT: 
The current time is 4:50:34
*/
import java.util.Scanner;
public class Exercise_02_08
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the time zone offset to GMT: ");
      long offset = sc.nextInt();
      
      long totalMilliseconds = System.currentTimeMillis();
     
      long seconds = totalMilliseconds / 1000;
      long currSec = seconds % 60;
      long minutes = seconds / 60;
      long currMin = minutes % 60;
      long hours = minutes / 60;
      long currHour = hours % 24;
      
      if (offset < 0)
      {
         currHour = currHour + offset+ 24;
      }
      else
         currHour += offset;
         
      System.out.print("The current time is: " + currHour + ":" + currMin
                       + ":" + currSec);
   }
}