/*
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java

*/
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) 
    {
        String A,B;
        Scanner sc=new Scanner(System.in);
        A=sc.nextLine();
        B=sc.nextLine();
        int countA=0;
        int countB=0;
        int sum;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!=' ')
            countA++;
        }
        for(int j=0;j<B.length();j++)
        {
            if(B.charAt(j)!=' ')
            countB++;
        }
        sum=countA+countB;
        System.out.println(sum);
        if(A.charAt(0)>B.charAt(0))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        String C=A.substring(0,1).toUpperCase()+ A.substring(1);
        String D=B.substring(0,1).toUpperCase()+ B.substring(1);
        System.out.println(C+" "+D);
    }
}
