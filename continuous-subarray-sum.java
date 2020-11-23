class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            if(k != 0){
                sum = sum % k;
            }
            if(map.containsKey(sum) && i - map.get(sum) > 1) return true;
            else if(map.containsKey(sum)) continue;
            else map.put(sum, i);
        }
        return false;
    }
}
