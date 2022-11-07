/*
Input Format

The first line contains an integer,T , denoting the number of test cases.
Each test case, T, is comprised of a single line with an integer,n , which can be arbitrarily large or small.

Output Format

For each input variable n and appropriate primitive datatype , you must determine if the given primitives are capable of storing it. If yes, then print:

sample input:- 
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

sample output:- 
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

*/
import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
                   try
                   {
                   long n1=sc.nextLong();
                   System.out.println(n1+" can be fitted in:");
                   if(n1>=-128 && n1<=127)
                   {
                       System.out.println("* byte");
                   }
                   if(n1>=-32768 && n1<=32767)
                   {
                       System.out.println("* short");
                   }
                   if(n1>=-2147483648 && n1<=2147483647)
                   {
                       System.out.println("* int");
                   }
                   if(n1>=-9223372036854775808L && n1<=9223372036854775807L)
                   {
                       System.out.println("* long");
                   }
                   }
                   catch(Exception e)
                   {
                       System.out.println(sc.next()+" can't be fitted anywhere.");
                   }
        }
        
    }
}

