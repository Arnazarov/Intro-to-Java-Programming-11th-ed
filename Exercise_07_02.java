/*
(Reverse the numbers entered) 
Write a program that reads ten integers and displays them 
in the reverse of the order in which they were read
*/
import java.util.Scanner;
public class Exercise_07_02
{
   public static void main(String[] args)
   {
      int[] arr = new int[10];
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 10 integers: ");
      for (int i = 0; i < arr.length; i++)
      {
         arr[i] = sc.nextInt();
      }
      
      for (int i = arr.length - 1; i >= 0; i--)
      {
         System.out.print(arr[i] + " ");
      }
        
   }
}
