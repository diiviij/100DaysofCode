import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static int B,H;
public static boolean flag = false;
static{
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt(); 
    H = sc.nextInt();
    if(B > 0 && H > 0){
        flag = true;
    }
    else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

// Input Format
// There are two lines of input. The first line contains B : the breadth of the parallelogram. The next line contains H : the height of the parallelogram.

// Constraints
// -100 <= B <= 100
// -100 <= H <= 100
// Output Format
// If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print “java.lang.Exception: Breadth and height must be positive” without quotes.

// Sample Input 1


//  1
//  3
// Sample Output 1

//  3
// Sample Input 2

//  -1
//  2
// Sample Output 2


//  java.lang.Exception: Breadth and height must be positive
