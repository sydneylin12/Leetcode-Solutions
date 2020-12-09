class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        ImmutableListNode top = null;
        ImmutableListNode current = head;
        while(top != head){
            current = head;
            while(current != top && current.getNext() != top){
                current = current.getNext();
            }
            current.printValue();
            top = current;
        }
    }
}
