/*
Task
We use the integers a, b, and n to create the following series:

(a + 20 x b), (a + 20 x b + 21 x b), . . . , (a + 20 x b + 21 x b + . . . + 2n-1 x b)

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

Input Format
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.

Constraints
0 <= q <= 500
0 <= a, b <= 50
1 <= n <= 15
Output Format
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int sum=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if((n>=1 && n<=15) && (a>=0 && a<=50) && (b>=0 && b<=50))
            {
                int j=0;
                while(j<n)
                {
                    int s =(int)Math.pow(2,j)*b;
                    sum=sum+s;
                    int z=sum+a;
                    System.out.print(z+" ");
                    j++;
                }
                sum=0;
                int z=0;
            }
            System.out.println("");
        }
        in.close();
    }
}
