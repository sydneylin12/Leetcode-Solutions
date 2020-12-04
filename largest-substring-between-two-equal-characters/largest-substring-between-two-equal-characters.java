class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] arr = new int[26];
        int res = -1;
        for(int i = 0; i < s.length(); i++) arr[s.charAt(i)-'a'] = i;
        for(int i = 0; i < s.length(); i++) res = Math.max(res, arr[s.charAt(i)-'a']-i-1);
        return res;
    }
}
