class Solution {
    public int[][] transpose(int[][] matrix) {
       int row = matrix.length;
       int col = matrix[0].length;
       int transpose[][] = new int[col][row];
       for(int i=0;i<col;i++)
       {
            for(int j=0;j<row;j++)
            {
                transpose[i][j] = matrix[j][i];

            }
       } 
       return transpose;
    }
}