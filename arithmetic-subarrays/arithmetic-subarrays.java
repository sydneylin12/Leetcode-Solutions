class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new LinkedList<>();
        for(int i = 0; i < l.length; i++){
            int start = l[i];
            int end = r[i];
            int[] arr = Arrays.copyOfRange(nums, start, end+1);
            Arrays.sort(arr);
            if(isArithmetic(arr)) res.add(true);
            else res.add(false);
        }
        return res;
    }
    
    // Helper method to check if the array is arithmetic or not
    public boolean isArithmetic(int[] arr){
        if(arr.length <= 2) return true;
        int diff = arr[1] - arr[0];
        for(int i = 2; i < arr.length; i++){
            int first = arr[i];
            int second = arr[i-1];
            if(first-second != diff) return false;
        }
        return true;
    }
}
