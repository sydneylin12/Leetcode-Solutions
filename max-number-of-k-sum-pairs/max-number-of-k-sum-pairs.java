class Solution {
    public int maxOperations(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0)+1);
        
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int complement = k-curr;
            
            
            if(!map.containsKey(curr)) continue;
            
            map.put(curr, map.get(curr)-1);
            if(map.get(curr) == 0) map.remove(curr);
            
            if(map.containsKey(complement)){
                map.put(complement, map.get(complement)-1);
                if(map.get(complement) == 0) map.remove(complement);
                res++;
            }
            
        }
        return res;
    }
}
