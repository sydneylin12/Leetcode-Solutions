class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int res = 0, score = 0;
        int start = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int end = 0; end < nums.length; end++){
            // Put in map, add to cum. score
            map.put(nums[end], map.getOrDefault(nums[end], 0)+1);
            score += nums[end];
​
            while(start < end && map.get(nums[end]) > 1){
                int st = nums[start++];
                score -= st;
                map.put(st, map.get(st)-1);
                if(map.get(st) == 0) map.remove(st);
            }
            
            res = Math.max(score, res);
        }
        return res;
    }
}
