class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] count = new int[5];
        int res = 0;
        int frogs = 0;
        for(char c : croakOfFrogs.toCharArray()){
            switch(c){
                case 'c': // This will always be valid
                    count[0]++;
                    frogs++;
                    res = Math.max(res, frogs);
                    break;
                case 'r':
                    if(count[0] == 0) return -1;
                    count[0]--;
                    count[1]++;
                    break;
                case 'o':
                    if(count[1] == 0) return -1;
                    count[1]--;
                    count[2]++;
                    break;
                case 'a':
                    if(count[2] == 0) return -1;
                    count[2]--;
                    count[3]++;
                    break;
                case 'k':
                    if(count[3] == 0) return -1;
                    count[3]--;
                    count[4]++;
                    frogs--;
                    break;
            }
        }
        return frogs == 0 ? res : -1;
    }
}
