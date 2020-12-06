class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int[] in : accounts){
            int sum = 0;
            for(int i = 0; i < in.length; i++) sum += in[i];
            res = Math.max(sum, res);
        }
        return res;
    }
}
