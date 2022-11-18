/*
A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .
Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
Input Format
A single line containing an integer,  (the number to be checked).
Output Format
If  is a prime number, print prime; otherwise, print not prime.
Sample Input
13
Sample Output
prime
Explanation
The only positive divisors of  are  and , so we print prime.
*/
import java.io.*;
import java.math.*;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger a=new BigInteger(n);
        System.out.println(a.isProbablePrime(10)?"prime":"not prime");
        bufferedReader.close();
    }
}

/*
TEST CASE 1
Compiler Message
Success
Input (stdin)
13
Expected Output
prime
*/
/*
TEST CASE 2
Compiler Message
Success
Input (stdin)
6513516734600035718300327211250928237178281758494417357560086828416863929270451437126021949850746381
Expected Output
prime
*/
