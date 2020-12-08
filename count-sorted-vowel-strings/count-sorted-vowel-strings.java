class Solution {
    public int[][] memo;
    
    public int countVowelStrings(int n) {
        char[] vowels = new char[]{'a','e','i','o','u'};
        memo = new int[n][5];
        int res = 0;
        for(int i = 0; i < 5; i++) res += backtrack(n-1, i, vowels);
        return res;
    }
    
    public int backtrack(int n, int idx, char[] vowels){
        if(n == 0) return 1;
        else if(memo[n][idx] != 0) return memo[n][idx];
        int res = 0;
        for(int i = idx; i < 5; i++) res += backtrack(n-1, i, vowels);
        memo[n][idx] = res;
        return res;
    }
}
