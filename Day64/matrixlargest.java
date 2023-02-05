import java.util.Scanner;

public class matrixlargest {
    /**
     * @param args
     * @return 
     */

    public static int search(int matrix[][],int n,int m) {
        int maxi =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m;  j++){
                maxi = Math.max(matrix[i][j], maxi);
            }
        }      
        return maxi;

    }


    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m;  j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m;  j++){
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }     
        int max_value = search(matrix,n,m);

        System.out.print(max_value);
    } 
}
