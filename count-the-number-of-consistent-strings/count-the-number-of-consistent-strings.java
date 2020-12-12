class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()) set.add(c);
        for(String s : words){
            boolean flag = true;
            for(char c : s.toCharArray()){
                if(!set.contains(c)){
                    flag = false;    
                    break;
                }
            }
            if(flag) res++;
        }
        return res;
    }
}
