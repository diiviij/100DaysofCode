package Day55;
import java.util.Scanner;
import java.util.Arrays;
public class Smallest {

        static int findSmallest(int arr[], int n){   
        Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }

        int ls =1;
        for(int j=0;j<n;j++)
        {
        if(ls<arr[j])
        {
            return ls;
        }
        
        else 
        {
            ls+=arr[j];
        }
    }
        return ls;
    }

public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1, 1,1};
        int n1 = arr1.length;
        System.out.println(findSmallest(arr1, n1));
        }
    }




