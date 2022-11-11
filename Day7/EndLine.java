import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int i = 0;
        while (sc.hasNextLine()) {
            System.out.println(++i + " " + sc.nextLine());
        }
    }

}



//Input Format

// Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

// Output Format

// For each line, print the line number, followed by a single space, and then the line content received as input.

// Sample Input

// Hello world
// I am a file
// Read me until end-of-file.
// Sample Output

// 1 Hello world
// 2 I am a file
// 3 Read me until end-of-file.
