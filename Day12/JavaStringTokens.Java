/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
Note: You may find the String.split method helpful in completing this challenge.
Input Format
A single string, .
Sample Input
He is a very very good boy, isn't he?
Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
Explanation
We consider a token to be a contiguous segment of alphabetic characters. There are a total of  such tokens in string , and each token is printed in the same order in which it appears in string .
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        s=s.trim();
        if(s.length()==0)
        {
            System.out.println(0);
        }
        else
        {
            String[] a = s.split("['!?,._@ ]+");
            System.out.println(a.length);
            for(String str : a)
            {
                System.out.println(str);
            }
        }
        
    }
}
/*
TEST CASE 1
Input (stdin)
He is a very very good boy, isn't he?
Your Output (stdout)
10
He
is
a
very
very
good
boy
isn
t
he
Expected Output
10
He
is
a
very
very
good
boy
isn
t
he
*/
/*
TEST CASE 2
Input (stdin)
Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!
Your Output (stdout)
21
Hello
thanks
for
attempting
this
problem
Hope
it
will
help
you
to
learn
java
Good
luck
and
have
a
nice
day
Expected Output
21
Hello
thanks
for
attempting
this
problem
Hope
it
will
help
you
to
learn
java
Good
luck
and
have
a
{-truncated-}
*/
