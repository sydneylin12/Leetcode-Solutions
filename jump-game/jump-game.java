class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        
        for(int i = 0; i < nums.length; i++){
            int jumps = nums[i]+1;
            
            for(int j = 0; j < jumps; j++){
                if(i + j < nums.length){
                    dp[i+j] = dp[i]; // We can reach the second one from the first
                }
            }
            //System.out.println(Arrays.toString(dp));
        }
        
        return dp[dp.length-1];
    }
}
