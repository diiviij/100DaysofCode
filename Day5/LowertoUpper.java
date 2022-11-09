/*
Problem:- to covert lower case string into upper case string

Sample input/output:- 

Enter any String 
hello
Given String = hello
Updated String = HELLO

*/

import java.util.Scanner;

public class LowertoUpper {
    static void changeCase(String str){
        String Neo;
     
       System.out.println("Given String = "+str);
       char ch = str.charAt(0);
       if(ch>='a' && ch<='z'){
        Neo =  str.toUpperCase();
       }
       else{
         Neo =  str.toLowerCase();
       }
     
       System.out.println("Updated String = "+Neo);
      }
     
      public static void main(String [] s){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter any String ");
        String name = sc.nextLine();
     
        changeCase(name);
      }
}
