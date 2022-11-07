/*
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

Sample Input 0

100

Sample Output 0

Good job

*/
import java.util.Scanner;

public class JavaInttoString {
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s;
      if(n>=-100 && n<=100)
      {
        s=Integer.toString(n);  
        System.out.println("Good job");
      }
      else
      {
          System.out.println("Wrong answer");
      } 
    }
}
