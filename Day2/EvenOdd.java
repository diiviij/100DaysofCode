/*
to check if a number is even or odd

Sample input/output:- 

enter the no
58
No is Even

enter the no
-89
No is Odd

*/
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the no");
        a=Sc.nextInt();
        if(a%2==0)
        {
            System.out.println("No is Even");
        }
        else
        {
            System.out.println("No is Odd");
        }
    }
}
