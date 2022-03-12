/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current=head;
        List<ListNode> list = new ArrayList<>();
        while(current!=null){
            if(list.contains(current)){
                return true;
            }
            list.add(current);
            current=current.next;
        }
        return false;
    }
}