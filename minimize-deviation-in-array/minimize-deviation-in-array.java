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
        
        while(set.size() >= 1){
            int first = set.first();
            int last = set.last();
            System.out.println(first + " " + last);
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
