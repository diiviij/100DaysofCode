public class countinarray {
    /**
     * @param args
     */
    public static void main(String args[]) {
        int count =0;
        int matrix[][]={
            {4, 7, 8},
            {8, 8, 7}
            };

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length; j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(" "+count);
    }
}
