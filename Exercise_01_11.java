/*
(Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
-One birth every 7 seconds
-One death every 13 seconds
-One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days
*/
public class Exercise_01_11
{
   public static void main(final String[] args) {
      final int currPop = 312032486;
      final double birthPerYear = 365 * 24 * 60 * 60 / 7;
      final double deathPerYear = 365 * 24 * 360 / 13;
      final double immPeryear = 365 * 24 * 360 / 45;
      int pop;
      
      for (int i = 1; i <= 110; i++)
      {
         pop = currPop + (int)((birthPerYear + deathPerYear + immPeryear) * i); 
         System.out.println("Population after " + i + " years: " + pop);
      }
      
       
   }
}
