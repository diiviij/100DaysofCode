import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //initialize scanner class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int N = sc.nextInt();
		//Start a for loop to find the divisors
		for(int i=1;i<N+1;i++){
		    //Check for divisors
		    if(N % i == 0){
		        //print divisors
		        System.out.print(i + " ");
		    }
		}
	}
}
