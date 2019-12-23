/*
(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is Ú best - 10
Grade is B if score is Ú best - 20;
Grade is C if score is Ú best - 30;
Grade is D if score is Ú best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:
Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
*/
import java.util.Scanner;
public class Exercise_07_01
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int max;
      
      System.out.print("Enter the number of student: ");      
      char[] grades = new char[sc.nextInt()];
      int[] scores = new int[grades.length];
      
      System.out.print("Enter " + scores.length + " scores: ");
      for (int i = 0; i < scores.length; i++)
      {
         scores[i] = sc.nextInt();
      } 
      
      max = scores[0];
      
      for (int i = 0; i < scores.length; i++)
      {
         if (scores[i] > max)
            max = scores[i];
      }
      
      for (int i = 0; i < scores.length; i++)
      {
         if (scores[i] >= (max - 10))
            grades[i] = 'A';
         else if (scores[i] >= (max - 20))
            grades[i] = 'B';
         else if (scores[i] >= (max - 30))
            grades[i] = 'C';
         else if (scores[i] >= (max - 40))
            grades[i] = 'D';         
         else
            grades[i] = 'F';
      }
       
       
      for (int i = 0; i < scores.length; i++)
      {
         System.out.printf("Student %d score is %d and grade is %s%n",i,scores[i],grades[i]);
      }
      
   }
}