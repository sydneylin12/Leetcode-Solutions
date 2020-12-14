class Solution {
    public int numberOfMatches(int n) {
        if(n == 0) return 0;
        if(n == 1) return 0;
        if(n % 2 == 1){
            int matches = (n-1)/2;
            int teams = matches+1;
            return matches + numberOfMatches(teams);
        }
        else{
            int matches = n/2;
            return matches + numberOfMatches(matches);
        }
    }
}
