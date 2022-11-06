/*
to get the day by enterning the day no using switch case

Sample Input/output:- 

Enter Day no
7
Sunday

Enter Day no
8
Entered wrong day no

*/
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        int d;
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Day no");
        d=Sc.nextInt();
        switch (d) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("Entered wrong day no");
                break;
        }
    }
}
