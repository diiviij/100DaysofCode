
package Test7Hunts;
import java.util.*;
class rangeintsum
{
    public static void main(String args[])
    {
        int i, sum=0,start,end,k;
        Scanner s = new Scanner(System.in);
        start=s.nextInt();
        end=s.nextInt();
        k=s.nextInt();
        s.close();
       for(i=start;i<=end;i++)
       {
         if(i%k==0)
         {
            System.out.print(i+" ");
            sum+=i;
         }
       }
    System.out.println("\nThe sum : "+sum);
    }
}
