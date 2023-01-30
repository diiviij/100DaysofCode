package Test7Hunts;

import java.util.*;
class series9_99
{
    public static void main(String args[])
    {
        int n,i,t=9;
	    int sum =0;
	    Scanner s =  new Scanner(System.in);
	    n=s.nextInt();
        s.close();
	    for (i=0;i<n;i++)
	    { 
            sum+=t;
	        System.out.println(t);
	        t=t*10+9;
    	}
        System.out.println(sum);
    }
} 
