import java.util.*;

public class array {
    /**
     * @param args
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);		
        int N = sc.nextInt();
        int[] arr = new int[100];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        int j;   
       for(int k=0;k<N;k++){ 
        for(j=k+1;j<N;j++){
            if(arr[k]>arr[j]){
                int temp =0;
                temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;                 
            }
        }
    }

        System.out.println("min "+arr[0]);
        System.out.println("max "+arr[N-1]);
    
    }
}
