/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummy= new ListNode();
        ListNode ans=dummy;
        ListNode current=head;
        while(current!=null){
            int number=current.val;
            if(current.next!=null && current.next.val==number){
                while(current.val==number){
                    if(current.next==null){
                        current=null;
                    break;}
                    else
                    current=current.next;
                }
            }
            else{
                dummy.next=new ListNode(current.val);
                dummy=dummy.next;
                current=current.next;
            }
        }
        return ans.next;
    }
}