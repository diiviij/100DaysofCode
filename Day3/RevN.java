/*
to print a reverse of an given integer

sample input/output:- 

Enter the no
5587
7 8 5 5 

*/
import java.util.Scanner;

public class RevN {
    public static void main(String[] args) {
        int n;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the no");
        n=Sc.nextInt();
        while(n>0)
        {
            int last = n%10;
            System.out.print(last+" ");
            n=n/10;
        }
        
    }
    
}
