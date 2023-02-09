import java.util.Scanner;

public class sumofnumber {
   
    public static void main(String args[]) {
        int sum =0;
        int matrix[][]={
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
            };

            for(int j=0;j<matrix[0].length; j++){
                sum+=matrix[1][j];
            
        }
        System.out.println(" "+sum);
    }
}


