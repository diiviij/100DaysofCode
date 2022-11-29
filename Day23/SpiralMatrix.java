public class SpiralMatrix{

    public static void spiralMatrix(int matrix[][]){
        int rows=matrix.length;
        int cols=matrix[0].length;

        int frontRow=0;
        int endCol=cols-1;
        int endRow=rows-1;
        int frontCol=0;
        int cnt=0,total=cols*rows;


        while(cnt<total){

            // print frontRow
            for(int i=frontCol;i<=endCol;i++){
                System.out.print(matrix[frontRow][i]+" ");
                cnt++;
            }
            frontRow++;

            // print endCol
            for(int i=frontRow;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
                cnt++;
            }
            endCol--;

            // print endRow
            for(int i=endCol;i>=frontCol;i--){
                System.out.print(matrix[endRow][i]+" ");
                cnt++;
            }
            endRow--;

            // print frontCol
            for(int i=endRow;i>=frontRow;i--){
                System.out.print(matrix[i][frontCol]+" ");
                cnt++;
            }
            frontCol++;


        }

    

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        spiralMatrix(matrix);
    }
}