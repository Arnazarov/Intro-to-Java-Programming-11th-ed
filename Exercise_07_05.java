/*
Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers. Here is
the sample run of the program:
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The number of distinct number is 6
The distinct numbers are: 1 2 3 6 4 5
*/
import java.util.Scanner;
public class Exercise_07_05
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[10];
      int num, count = 0;
     
      System.out.print("Enter ten numbers: ");
      
      for (int i = 0; i < 10; i++)
      {
         boolean inArray = false;
         num = sc.nextInt();
         for (int j = 0; j < 10; j++)
         {
            if (num == arr[j])
               inArray = true;
         }
         if (!inArray)
         {
            arr[count] = num;
            count++;
         }
      }

      System.out.printf("The number of distinct number is %d%n", count);
      System.out.printf("The distinct number are: ");
      for (int i = 0; i < count; i++)
      {
         System.out.printf("%d" + " ", arr[i]);
         
      }
   }
}