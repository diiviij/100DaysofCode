/*
Problem:- To take input of name and age and display it
used scanner class to input the string and age

Sample Input:- 

Enter your name
Devyansh Rajput
Enter your age
21

Sample Out:- 
Entered Name:- Devyansh Rajput
Entered Age:- 21

*/
import java.util.Scanner;

public class Stringinout {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc= new Scanner(System.in);
        String A=sc.nextLine();
        System.out.println("Enter your age");
        int n=sc.nextInt();
        System.out.println("Entered Name:- "+A);
        System.out.println("Entered Age:- "+n);
    }
    
}
