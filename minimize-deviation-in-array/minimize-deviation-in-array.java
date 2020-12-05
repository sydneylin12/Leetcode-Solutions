class Solution {
    public int minimumDeviation(int[] nums) {
        int res = Integer.MAX_VALUE;
        int maxPossible = 0;
        TreeSet<Integer> set = new TreeSet<>();
                
        // Add all EVEN numbers
        for(int i : nums){
            if(i % 2 == 0){
                set.add(i);
            }
            else set.add(i*2);
        }
                
        // 1. get smallest and largest element
        // 2. calculate deviation
        // 3. if largest is even, we can make it smaller - DO NOT MAKE ANY LARGER 
        while(!set.isEmpty()){
            int first = set.first();
            int last = set.last();
            res = Math.min(res, last-first);
            if(last % 2 == 0){
                set.remove(last);
                set.add(last/2);
            }
            else break;
        }
        
        return res;
    }
}
