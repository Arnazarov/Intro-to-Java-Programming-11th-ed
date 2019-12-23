/*
(Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program:
Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
*/
import java.util.Scanner;
public class Exercise_07_03
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[100];
      int count = 0, num;
      
      System.out.print("Enter the integers between 1 and 100: ");
      do {
			
         num = sc.nextInt();	
		   arr[count] = num;
         count++;
         
		} while (num != 0); 
  
      for (int i = 1; i <= 100; i++)
      {
         int sum = 0;
         for (int j = 0; j < arr.length-1; j++)
         {
            if(arr[j] == i)
               sum++;
         }
         if (sum != 0)
            System.out.printf("%d occurs %d %s%n",
                               i, sum, sum > 1 ? "times": "time");     
         
      }
         
      
 
 
   }
}
