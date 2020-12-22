class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // Return value and placeholder/local score value
        int res = 0, score = 0;
        int start = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int end = 0; end < nums.length; end++){
            // Put in map, add to cum. score
            map.put(nums[end], map.getOrDefault(nums[end], 0)+1);
            score += nums[end];
​
            // Use the while loop while the current number is not unique
            // Will run at every index so previous numbers will be unique inside the map
            while(start < end && map.get(nums[end]) > 1){
                // Start removing from HashMap
                int st = nums[start++];
                score -= st;
                map.put(st, map.get(st)-1);
            }
            res = Math.max(score, res);
        }
        return res;
    }
}
