class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean neg = false;
        if(num < 0){
            neg = true;
            num = Math.abs(num);
        }
        String res = "";
        while(num > 0){
            res = (num % 7) + res;
            num = num / 7;
        }
        if(neg) res = "-" + res;
        return res;
    }
}
