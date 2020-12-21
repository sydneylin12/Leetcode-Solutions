class Solution {
    public String reformatNumber(String number) {
        Queue<Character> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        
        for(char c : number.toCharArray()){
            if(Character.isDigit(c)) queue.offer(c);
        }
        
        while(queue.size() > 4){
            for(int i = 0; i < 3; i++){
                res.append(queue.poll());
            }
            res.append("-");
        }
        
        if(queue.size() == 2){
            res.append(queue.poll());
            res.append(queue.poll());
        }
        else if(queue.size() == 3){
            res.append(queue.poll());
            res.append(queue.poll());
            res.append(queue.poll());
        }
        else{
            res.append(queue.poll());
            res.append(queue.poll());
            res.append("-");
            res.append(queue.poll());
            res.append(queue.poll());
        }
        
        return res.toString();
    }
}
