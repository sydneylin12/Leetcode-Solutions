class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i = 0; i < nums.length; i++){
            int jumps = nums[i]+1;
            for(int j = 0; j < jumps; j++){
                if(i + j < nums.length){
                    dp[i+j] = Math.min(dp[i+j], dp[i] + 1); 
                }
            }
        }
        
        return dp[dp.length-1];
    }
}
