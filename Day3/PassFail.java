/*
to check if a student is pass or fail pass marks>=33

Sample input/output;- 

enter marks
74
pass

enter marks
22
Fail

*/
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        int m;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter marks");
        m=Sc.nextInt();
        String Rc= (m>=33)?"pass":"Fail";
        System.out.println(Rc);

    }
}
