import java.lang.Math;
import java.util.Scanner;
public class GFGHeight {
    public int getDatA(int arr[], int n, int k) {
        int min=arr[0];
        int max=arr[n-1];
        int diff=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            min=Math.min(arr[i]-k,arr[0]+k);
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            diff=Math.min(diff,max-min);
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        GFGHeight ob=new GFGHeight();
        int a=ob.getDatA(arr,n,k);
        System.out.println(a);
    }
}
