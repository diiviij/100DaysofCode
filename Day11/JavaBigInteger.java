/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
Use the power of Java's BigInteger class and solve this problem.
Input Format
There will be two lines containing two numbers,  and .
Constraints
 and  are non-negative integers and can have maximum  digits.
Output Format
Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.
Sample Input
1234
20
Sample Output
1254
24680
*/
import java.io.*;
import java.util.*;
import java.math.*;

public class JavaBigInteger 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BigInteger a= new BigInteger(sc.nextLine());
        BigInteger b= new BigInteger(sc.nextLine());
        
        BigInteger sum=a.add(b);
        BigInteger mul=a.multiply(b);
        System.out.println(sum);
        System.out.println(mul);      
    }
}
/*
TEST CASE 1
Compiler Message
Success
Input (stdin)
999999992344444444444499999990000000000000000000000
213200000000000001231230000000000000000000000000000000000000000000000000000000000000000000000
Expected Output
213200000000000001231230000000000000000000999999992344444444444499999990000000000000000000000
213199998367835556786797390572118333333401734987687700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
*/
/*
TEST CASE 2
Success
Input (stdin)
0
12312312312354365499999
Expected Output
12312312312354365499999
0
*/
/*
TEST CASE 3
Compiler Message
Success
Input (stdin)
1234
20
Expected Output
1254
24680
*/
/*
TEST CASE 4
Compiler Message
Success
Input (stdin)
123456789123456789
100000000000000000
Expected Output
223456789123456789
12345678912345678900000000000000000
*/
