/*
(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
2 * 2 system of linear equation:
		ax + by = e   x = 	ed - bf	  y = af - ec
		cx + dy = f       	ad - bc       ad - bc
Write a program that solves the following equation and displays the value for x and y:
					3.4x + 50.2y = 44.5
					2.1x + .55y = 5.9
*/
public class Exercise_01_13
{
   public static void main(String[] args)
   {
      double a, b, c, d, e, f, x, y;
      a = 3.4;
      b = 50.2;
      c = 2.1;
      d = .55;
      e = 44.5;
      f = 5.9;
      x = (e*d - b*f) / (a*d - b*c);
      y = (a*f - e*c) / (a*d - b*c);
      System.out.println("x is " + (double)Math.round(x*100)/100);
      System.out.println("y is " + (double)Math.round(y*100)/100);
   }
}