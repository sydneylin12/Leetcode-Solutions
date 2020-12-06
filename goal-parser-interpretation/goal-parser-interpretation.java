class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        while(idx < command.length()){
            char c = command.charAt(idx);
            if(c == 'G'){
                sb.append("G");
                idx++;
            }
            else if(c == '('){
                char after = command.charAt(idx+1);
                if(after == ')'){
                    sb.append("o");
                    idx += 2;
                }
                else{
                    sb.append("al");
                    idx += 4;
                }
            }
        }
        return sb.toString();
    }
}
