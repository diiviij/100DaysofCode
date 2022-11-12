import java.util.Scanner;

public class sum{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); 
    int b= sc.nextInt();
    
    int c = sumofnumber(a,b);
    System.out.println("The sum of a and b is= " + c);  
}

    public static int sumofnumber(int c, int d){

        int sum = c+d;
        return sum;
    }
}

//Function call by vale