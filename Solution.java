class Solution {
    public void setZeroes(int[][] matrix) 
    {//1. we will take the original array and make a boolean array to map which parts of the matrix we will change
        boolean[][] map = new boolean[matrix.length][matrix[0].length];
        for(int m = 0; m < matrix.length; m++)
        {
            for(int n = 0; n < matrix[0].length; n++)
            {
                if(matrix[m][n]==0) // when a 0 is found on the original array
                {
                    for(int i = 0; i < matrix[0].length; i++) // the boolean array will be set to true for the entire row and col
                    {
                        map[m][i] = true;
                    }
                    for(int i = 0; i < matrix.length; i++)
                    {
                        map[i][n] = true;
                    }
                }
            }
        }
        //once the entire array is mapped, we now update it
        for(int m = 0; m < matrix.length; m++)
        {
            for(int n = 0; n < matrix[0].length; n++)
            {
                if(map[m][n])
                {
                    matrix[m][n]=0;
                }
            }
        }
        
    }
}
