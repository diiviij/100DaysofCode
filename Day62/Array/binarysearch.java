import java.util.*;

public class binarysearch {
        public static int search(int num[], int key){
            int start =0,end = num.length-1;
            while(start<= end){
                int mid = (start+end)/2;
                if(key == num[mid]){
                    return mid;
                } 
                if(num[mid] < key){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            return -1;
        }
    public static void main(String args[]) {
        int num[] = {2,4,6,8,10,12};
        int key = 8;
        System.out.println("founded at"+ search(num, key));
    }
}
