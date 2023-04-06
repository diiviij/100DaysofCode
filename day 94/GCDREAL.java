import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          int T=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        int[] a = new int[n];
        for(int k=0;k<T;k++)
            {
            
            
        for(int i=0;i<n;i++)
          {
          a[i]=sc.nextInt();
        }
        for(int j=2;j<n;j++){
         for(int i=0;i<n;i++)
          {
             if(a[i]==0)
                 {
                 
                 System.out.println("NO");
                 break;
             }
                else if(a[i]==0)
                    c=c+1;
             }
        }
         if(c==n/2)
             System.out.println("Yes");
        
        }    
        
       
    }
}