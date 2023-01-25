package Test7Hunts;

import java.util.*;
class leapyear 
{ 
    public static void main(String args[])
    {
        int chk_year;
        Scanner s = new Scanner(System.in);
        chk_year=s.nextInt();
        s.close();
        if ((chk_year % 400) == 0)
            System.out.println(chk_year +" is a leap year.");
        else if ((chk_year % 100) == 0)
            System.out.println(chk_year +" is not a leap year.");
        else if ((chk_year % 4) == 0)
            System.out.println(chk_year +" is a leap year.");
        else
            System.out.println(chk_year +" is not a leap year.");
    }
}
