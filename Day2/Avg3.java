/*
Problem:- To calculate average of 3 numbers
calulated the sum of all numbers and calulating the average

Sample input/output:- 

Enter Numbers
47
85
99
Output:- 
77

*/
import java.util.Scanner;

public class Avg3 {
    public static void main(String[] args) {
        int a,b,c,avg,sum;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        sum=a+b+c;
        avg=sum/3;
        System.out.println(avg);
    }
}
