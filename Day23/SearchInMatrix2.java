import java.util.*;
// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.
public class SearchInMatrix2{
    public static boolean SearchInMatrix2(int matrix[][],int target){
    

        if(target<matrix[0][0] || target>matrix[matrix.length-1][matrix[0].length-1]){
            return false;
        }
        int row=0,col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                System.out.println("Found at ("+row+","+col+")");
                return true;
            }else if(target<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }

        System.out.println("Not Found");
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.print("Enter target value: ");
        int target=sc.nextInt();
        System.out.println(SearchInMatrix2(matrix, target));
    }
}