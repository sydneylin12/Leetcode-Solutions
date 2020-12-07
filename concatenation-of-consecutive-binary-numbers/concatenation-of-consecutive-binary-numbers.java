class Solution {
    public int concatenatedBinary(int n) {
        int MOD = 1000000007;
        int res = 0;
        for(int i = 1; i <= n; i++){
            String s = Integer.toBinaryString(i);
            for(int j = 0; j < s.length(); j++){
                res = (res * 2 + (s.charAt(j)-'0')) % MOD;
            }
        }
        return res;
    }
}
