/*
Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3

Sample output 1

3

Sample input 2

-1
2

Sample output 2

java.lang.Exception: Breadth and height must be positive

*/
public static int B,H;
    public static boolean Check=false;
    
    static
    {
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        if(B>0 && H>0)
        {
          Check=true;
        }
        else
        {
          System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) 
    {
        if(Check)
        {
           int area=B*H;
           System.out.println(area); 
        }
    }
