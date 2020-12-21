class Solution {
    public boolean canReach(int[] nums, int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        
        queue.offer(start);
        while(!queue.isEmpty()){
            int node = queue.poll();
            if(node < 0 || node >= nums.length) continue;
            else if(visited[node]) continue;
            
            System.out.println(node);
            
            visited[node] = true;
            int i = nums[node];
            queue.offer(node + i);
            queue.offer(node - i);
        }
        
        System.out.println(Arrays.toString(visited));
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 && visited[i]) return true;
        }
        return false;
    }
}
