import java.util.*;

//row are sorted from left to right
//first integer of each row is greater than the last integer of previous row

public class SearchInMatrix1{
    public static boolean searchInMatrix1(int matrix[][], int target){

       
        
        int row=matrix.length;
        int col=matrix[0].length;

        int si=0,ei=row*col-1;
        int mid=si+(ei-si)/2;

        if(target<matrix[0][0] || target>matrix[row-1][col-1]){
            return false;
        }

        while(si<=ei){
            int val=matrix[mid/col][mid%col];
            if(val==target){
                System.out.println("Found at ("+mid/col+","+mid%col+")");
                return true;
            }else if(target<val){
                ei=mid-1;
            }else{
                si=mid+1;
            }
            mid=si+(ei-si)/2;
        }

        System.out.println("Not Found");
        return false;
    }
    public static void print(int matrix[][]){
        System.out.println("Matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]={{1,2,3,4},{10,12,14,15},{20,30,40,50}};
        print(matrix);
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        searchInMatrix1(matrix, target);
    }
}