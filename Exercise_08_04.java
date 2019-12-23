/*
(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays
employees and their total hours in decreasing order of the total hours.
Su M T W Th F Sa
Employee 0 2 4 3 4 5 8 8
Employee 1 7 3 4 3 3 4 4
Employee 2 3 3 4 3 3 2 2
Employee 3 9 3 4 7 3 4 1
Employee 4 3 5 4 3 6 3 8
Employee 5 3 4 4 6 3 4 4
Employee 6 3 7 4 8 3 8 4
Employee 7 6 3 5 9 2 7 9
*/
import java.util.Scanner;
public class Exercise_08_04
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       int[][] arr = {{2, 4, 3, 4, 5, 8, 8},
                    {7, 3, 4, 3, 3, 4, 4},
                    {3, 3, 4, 3, 3, 2, 2},
                    {9, 3, 4, 7, 3, 4, 1},
                    {3, 5, 4, 3, 6, 3, 8},
                    {3, 4, 4, 6, 3, 4, 4},
                    {3, 7, 4, 8, 3, 8, 4},
                    {6, 3, 5, 9, 2, 7, 9}};
                    
       int[] result = new int[arr.length];
       
       for (int r = 0; r < arr.length; r++)
       {
         int sum = 0;
         for (int c= 0; c < arr[r].length; c++)
         {
            sum += arr[r][c];
         }
         result[r] = sum;
       }
       
       for (int i = 0; i < result.length; i++)
       {
         int max = result[i];
         for (int j = i + 1; j < result.length; j++)
         {
            if (result[j] > result[i])
            {
               max = result[j];
               result[j] = result[i];
               result[i] = max;
            }
         }
       }
                    
       for (int i = 0; i < result.length; i++)
       {
         System.out.println(result[i]);
       }             
                    
             
   }
}
