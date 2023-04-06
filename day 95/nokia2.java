import java.util.*;
import java.util.Arrays;
public class nokia2 {
   
        static void calc(int[] arr, int n, int top) {
            top = n - top;
            int sum=0;
            for(int j = n;j>top;j--){
                sum+=arr[j];
            }
            System.out.println(sum);
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1]; int top = sc.nextInt();  int sum =0;
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
            }
        Arrays.sort(arr);
        calc(arr,n,top);
        }
}
