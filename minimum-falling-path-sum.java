class Solution {
    public int minFallingPathSum(int[][] A) {
        int[][] dp = new int[A.length][A[0].length];
        int min = Integer.MAX_VALUE;
        
        
        for(int j = 0; j < A[0].length; j++){
            dp[0][j] = A[0][j];
        }
        
        for(int i = 1; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                int curr = A[i][j];
                
                if(j == 0){ // Minimum of first and to right
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j+1]) + curr;
                }
                else if(j == A[0].length-1){ // Minimum of 
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-1]) + curr;
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i-1][j+1])) + curr;
                }
            }
        }
        for(int j = 0; j < A[0].length; j++){
            min = Math.min(min, dp[dp.length-1][j]);
        }
        return min;
    }
}
