/*
to create a basic calulator using switch case

sample input/output:- 

85
5
/
Division of values:- 17

*/
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int a,b;
        Scanner Sc= new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        char operator = Sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Addition of values:- "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of values:- "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication od values:- "+(a*b));
                break;
            case '/':
                System.out.println("Division of values:- "+(a/b));
                break;
            default:
                System.out.println("Wrong Operator entered");
                break;
        }

    }
}
