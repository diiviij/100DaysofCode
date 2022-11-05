/*
Complete the function solveMeFirst to compute the sum of two integers.

Example


Return .

Function Description

Complete the solveMeFirst function in the editor below.

solveMeFirst has the following parameters:

int a: the first value
int b: the second value
Returns
- int: the sum of  and 
*/
import java.util.Scanner;

public class SolveMeFirst 
{
    public static void main(String[] args) 
    {
        int a,b,sum;
        Scanner SC = new Scanner(System.in);
        a=SC.nextInt();
        b=SC.nextInt();
        sum= a+b;
        System.out.println(sum);   
    }
    
}
