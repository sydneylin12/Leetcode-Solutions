class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();   
        
        int lcd = 0;
        int diff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            lcd = Math.max(arr[i]-arr[i-1], lcd);
            diff = Math.min(arr[i]-arr[i-1], diff);
        }
                
        for(int i = 1; i < arr.length; i++){
            if(arr[i]-arr[i-1] == lcd){ // Largest consecutive diff.
                return arr[i-1] + diff;
            }
        }
        return -1;
    }
}
