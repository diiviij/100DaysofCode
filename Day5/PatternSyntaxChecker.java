/*
Input Format

The first line of input contains an integer n, denoting the number of test cases. The next n lines contain a string of any printable characters representing the pattern of a regex.

Output Format

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

Sample input:- 
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample output:- 
Valid
Invalid
Invalid

*/
public class PatternSyntaxChecker
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while(n>0){
			String A = sc.nextLine();
          	try
        {
            Pattern.compile(A);
            System.out.println("Valid");
        }
        catch(PatternSyntaxException e)
        {
            System.out.println("Invalid");
        }
        n--;
        }
		}
	}
