/*
to print the sum of 0 to n number taken from user using loop

Sample input/output:-

Enter Numbers
8
Sum:-  36

*/
public class SumN {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        n=Sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum:-  "+sum);
    }
}
