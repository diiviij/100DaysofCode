import java.util.*;
public class DiagonalSum{
    public static int diagonalSum(int matrix[][]){
        int sum1=0,sum2=0;
        for(int i=0,j=0;i<matrix.length;i++,j++){
            sum1+=matrix[i][j];
        }
        for(int j=matrix.length-1,i=0;j>=0;j--,i++){
            if(i==j){
                continue;
            }
            sum2+=matrix[j][i];
        }
        /*
         int diagonalSum(vector<vector<int>>& mat) {
        int n=mat.size(),ans=0;
        for(int i=0;i<n;i++){
            if(i!=n-i-1) ans+=mat[i][i]+mat[i][n-i-1];
            else ans+=mat[i][i];   
        }
        return ans;
        }
         */

        return sum1+sum2;
    }
    public static void main(String arg[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sumOfDiagonal=diagonalSum(matrix);
        System.out.println("Sum: "+sumOfDiagonal);

    }
}
