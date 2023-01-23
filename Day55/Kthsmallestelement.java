package Day55;
// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

import java.util.Scanner;
import java.util.Arrays;
// Example 1:

// Input:
// N = 6
// arr[] = 7 10 4 3 20 15
// K = 3
// Output : 7
// Explanation :
// 3rd smallest element in the given 
// array is 7.

// Example 2:

// Input:
// N = 5
// arr[] = 7 10 4 20 15
// K = 4
// Output : 15
// Explanation :
// 4th smallest element in the given 
// array is 15.

public class Kthsmallestelement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        int[] arr;
        arr = new int[n];
        System.out.println("Enter the array");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        k = sc.nextInt();
        Arrays.sort(arr);

        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        // To print out the array
            System.out.print(arr[k-1]);

    }
}
