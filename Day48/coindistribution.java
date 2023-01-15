import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Enter the Number");
    Scanner s = new Scanner (System.in);
    int number = s.nextInt ();
    int one = 0, two = 0;
    int five = (number - 4) / 5;
    if (((number - 5 * five) % 2) == 0)
      {
	one = 2;
      }
    else
      {
	one = 1;
      }
    two = (number - 5 * five - one) / 2;
    System.out.println (one + two + five);
    System.out.println (five);
    System.out.println (two);
    System.out.println (one);

  }
}
