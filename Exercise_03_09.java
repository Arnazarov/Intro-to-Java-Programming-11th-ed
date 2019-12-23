/*
(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other nine digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer. Here are sample runs:
Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671
*/
import java.util.Scanner;
public class Exercise_03_09
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first 9 digits of an ISBN as integer: ");
      int input = sc.nextInt();
      
      char temp = 'X';
      int d1, d2, d3, d4, d5, d6, d7, d8, d9;
      
      d9 = input % 10;
      d8 = input / 10 % 10;
      d7 = input / 100 % 10;
      d6 = input / 1000 % 10;
      d5 = input / 10000 % 10;
      d4 = input / 100000 % 10;
      d3 = input / 1000000 % 10;
      d2 = input / 10000000 % 10;
      d1 = input / 100000000 % 10;
      
      int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                  d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
                  
      System.out.print("The ISBN-10 number is " + input);
                        
      if (d10 == 10)
         System.out.print(temp);   
      else           
         System.out.print(d10);
                      
   }
}