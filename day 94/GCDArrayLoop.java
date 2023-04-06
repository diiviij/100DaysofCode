package NetApp;
import java.util.*;

import javax.lang.model.element.Element;
public class GCDArrayLoop {
        static int gcd(int a, int b){
            if(a==0)
                return b;
            return gcd(b%a,a);
        }


        static int findgcd(int arr[], int j){
            int result = arr[0];
            for(int element:arr){
                 result =  gcd(result, element);
                 if(result == 1){
                    return 1;
                 }
            }
            return result;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){

            int j = sc.nextInt();
            int arr[] = new int[j];

            for(int k=0;k<j;k++){
                arr[k]= sc.nextInt();
            }
            System.out.println(findgcd(arr,n));
        }
        }
}
