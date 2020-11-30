class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
            for(int i = 0; i < m; i++){
                if(current == null) break;
                prev = current;
                current = current.next;
            }
            for(int i = 0; i < n; i++){
                if(current == null) break;
                current = current.next;
            }
            prev.next = current;
        }
        return head;
    }
}
