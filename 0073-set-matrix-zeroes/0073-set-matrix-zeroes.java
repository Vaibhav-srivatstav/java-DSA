class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] col = new boolean[n];
        boolean[] row = new boolean[m];
        for(int i =0 ; i<n ; i++){
            for(int j =0 ; j<m ;j++){
                if(matrix[i][j]==0){
                    col[i]=true;
                    row[j]=true;
                }
            }
        }for(int i =0 ; i< n ; i++){
            for(int j = 0 ;j<m ;j++){
                if(col[i] || row[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}