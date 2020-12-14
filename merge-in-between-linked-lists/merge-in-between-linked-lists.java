/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        
        ListNode prev = null;
        ListNode curr = list1;
        ListNode end = null;
        ListNode start = null;
        
        int i = 0;
        while(curr != null){
            if(i == a) end = prev;
            if(i == b) start = curr;
            prev = curr;
            curr = curr.next;
            i++;
        }
                
        end.next = list2;
        ListNode tail = getTail(list2);
        tail.next = start.next;
        return list1;
    }
    
    public ListNode getTail(ListNode curr){
        while(curr != null && curr.next != null) curr = curr.next;
        return curr;
    }
}
