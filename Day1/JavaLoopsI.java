/*
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
*/
import java.util.Scanner;

public class JavaLoopsI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int result=0;
        for(int i=1;i<=10;i++)
        {
            result=N*i;
            System.out.printf("%d x %d = %d\n",N,i,result);
        }   
    }
}
