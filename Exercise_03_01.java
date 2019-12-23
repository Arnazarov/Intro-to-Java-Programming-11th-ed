/*(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:
r1 =
-b + 2b2 - 4ac
2a
and r2 =
-b - 2b2 - 4ac
2a
b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.
Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some
sample runs.
Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803
*/
import java.util.Scanner;
public class Exercise_03_01
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a, b, c: ");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      
      double discriminant, r1, r2;
      discriminant = b*b - 4*a*c;
      
      if ( discriminant > 0)
      {
         r1 = (-b + Math.pow(discriminant, 0.5))/2*a;
         r2 = (-b - Math.pow(discriminant, 0.5))/2*a;
         System.out.printf("The equation has two roots %.6f and %.5f", r1, r2);
      }
      else if (discriminant == 0)
      {
         r1 = (-b + Math.pow(discriminant, 0.5))/2*a;
         System.out.print("The equation has one root " + r1);
      }
      else
      {
         System.out.print("The equation has no real roots");
      }
      
      
   }

}
