import java.util.Scanner;

public class dsa {
       public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);	
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ar = new int[100];
        int[] ar1 = new int[100];
        int[] ar2 = new int[100];
        int j=0;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();}
            
        for(int i=0;i<m;i++){
            ar1[i]=sc.nextInt();}   
         
         for(int i=0;i<n;i++){
            if(ar[i]==ar1[i]){
                ar2[j]=ar[i];
                    j++;}
            else {ar2[j]=ar[i];
                    j++;} 
             
         }  
           
         for(int i=0;i<j;i++){
            System.out.print(" "+ar2[i]);}   

    }
}
