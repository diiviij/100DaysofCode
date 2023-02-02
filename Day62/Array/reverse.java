import java.util.Scanner;

public class Reverse {
       public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);	
        int T = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[100];
        int start = 0; int end = N-1;
    
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

       while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
       }

       for(int i=0;i<N;i++)
       System.out.print(" "+arr[i]);   

    }
}
